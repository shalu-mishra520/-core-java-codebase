package com.onlinecake.order.webservices.onlinecakeorderwebservices.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.onlinecake.order.webservices.onlinecakeorderwebservices.Entity.CakeDescription;
import com.onlinecake.order.webservices.onlinecakeorderwebservices.Entity.OwnerDetails;

import ch.qos.logback.core.net.SyslogOutputStream;


@Component
public class serviceInterfaceImplementation implements serviceInterfaceMethod {
	
	@Autowired
	CakeDescription cakeDes;
	
	 static ArrayList<CakeDescription> newCake=new ArrayList<CakeDescription>();
	 
	

	public List<OwnerDetails> getOwnerDetails() {
		
		List<OwnerDetails> ownerList=new ArrayList<OwnerDetails>();
		
		OwnerDetails ownerDetails=new OwnerDetails("Vibha Mishra","vibhamishra2k11@gmail.com", "908083902","suryanager");
		ownerList.add(ownerDetails);
		
		return ownerList;
	}

	public List<CakeDescription> getCakeDescription() {
		 
		try{
		if(newCake.size()!=0){
			return newCake;
		}
		}catch(Exception e){
			   System.out.println("excption occured:"+e);
	   }
	  return null;
	}

	public boolean getNewCakeInMenu(CakeDescription cake) {
		
		System.out.println("adding in the list");
		newCake.add(cake);
		for(CakeDescription c:newCake){
			System.out.println(c.getCakeName());
		}
		return true;
		
		
	}
	

}
