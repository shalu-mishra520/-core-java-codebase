package MovieBooking;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		
		ArrayList<Seats> JanakSeats=Seats.addSeatName(5,10);
		
		Theatre theatre=new Theatre("PVR Cine Complex",JanakSeats);
		theatre.getSeatNumber();
		
		Seats s=new Seats("A08");
		boolean flag=s.bookSeatNumber(s.getSeatName(),"book");
		System.out.println(flag);
		System.out.println(s.book);
		boolean flag2=s.bookSeatNumber(s.getSeatName(),"cancel");
		System.out.println(flag2);
		System.out.println(s.book);
	}

}
