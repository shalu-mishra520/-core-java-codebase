package MovieBooking;

import java.util.ArrayList;
import java.util.Collections;

public class Theatre {
	String name;
	ArrayList<Seats> seats;
	
	Theatre(String name,ArrayList<Seats> seats){
		this.name=name;
		this.seats=seats;
		
	}
	
	
	public void getSeatNumber(){
		
	    System.out.println("Theatre Name:"+name);	
		for(Seats seat:seats){
			System.out.print(seat.getSeatName()+" ");
		}
		
	}
	
	public boolean cancelBooking(String seatNum){
		return false;
		
	}


	

}
