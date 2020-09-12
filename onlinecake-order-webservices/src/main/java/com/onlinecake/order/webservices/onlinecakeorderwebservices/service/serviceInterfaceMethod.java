package com.onlinecake.order.webservices.onlinecakeorderwebservices.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.onlinecake.order.webservices.onlinecakeorderwebservices.Entity.CakeDescription;
import com.onlinecake.order.webservices.onlinecakeorderwebservices.Entity.OwnerDetails;


@Service
public interface serviceInterfaceMethod {

	public List<OwnerDetails> getOwnerDetails();

	public List<CakeDescription> getCakeDescription();

	public boolean getNewCakeInMenu(CakeDescription cake);
	
	
}
