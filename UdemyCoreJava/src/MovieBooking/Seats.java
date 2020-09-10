package MovieBooking;

import java.util.ArrayList;
import java.util.Collections;

public class Seats implements Comparable<Seats>{
	
	 String seatName;
	 boolean  book;
	
	public static ArrayList<Seats> seatlist=new ArrayList<>();
	  
		Seats(String seatName){
		this.seatName=seatName;
		this.book=false;
	}
	
	public static ArrayList<Seats> addSeatName(int noOfRows,int seatIneachRow){
		int lastRow='A'+(noOfRows-1);
		for(char c='A';c<lastRow;c++){
			for(int i=0;i<seatIneachRow;i++){
			  Seats	seat=new Seats(c+String.format("%02d",i));
			  seatlist.add(seat);
			}
		}
		
		return seatlist;
		
	}

	public String getSeatName() {
		return seatName;
	}

	@Override
	public int compareTo(Seats o) {
		return this.seatName.compareTo(o.getSeatName());
	}
	
      public  boolean bookSeatNumber(String seatNum,String action){
    	 
		
    	  Seats seatName=new Seats(seatNum);
    	  
		int index=Collections.binarySearch(seatlist,seatName,null);
		System.out.println("index:"+index);
		
		boolean flag = false;
		
	  if(-1<index && index<seatlist.size()){
		  
		 if("book".equalsIgnoreCase(action)){
			 System.out.println("book");
			flag=this.reserve(seatName);
			System.out.println("flag return:"+flag);
		}else if("cancel".equalsIgnoreCase(action)){
			flag=this.cancel(seatName);
		}else
			flag=true;
			
		 return flag;
	   }
	 
	  return flag;
	}

	public boolean reserve(Seats seatName2) {
		
		if(!seatName2.book){
			this.setBook(true);
			return true;
		}else{
			System.out.println(seatName2.getSeatName()+" this seat is already booked!!");
			return false;
		}
	}
	
	public boolean cancel(Seats seatCancel){
		
		if(seatCancel.book==true){
			System.out.println("seat cancel starts");
			this.setBook(false);
			return false;
		}else
			return seatCancel.book=false;
		
	}
	public void setBook(boolean book) {
		this.book = book;
	}

	


}
