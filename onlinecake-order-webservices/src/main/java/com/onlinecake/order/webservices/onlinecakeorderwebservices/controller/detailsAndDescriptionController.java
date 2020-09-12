package com.onlinecake.order.webservices.onlinecakeorderwebservices.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.onlinecake.order.webservices.onlinecakeorderwebservices.Entity.CakeDescription;
import com.onlinecake.order.webservices.onlinecakeorderwebservices.Entity.CakeMenuAddition;
import com.onlinecake.order.webservices.onlinecakeorderwebservices.Entity.OwnerDetails;
import com.onlinecake.order.webservices.onlinecakeorderwebservices.service.serviceInterfaceMethod;



@RestController
public class detailsAndDescriptionController {
	
	@Autowired
	serviceInterfaceMethod service;
	
	@GetMapping(path="/cakes/ownerDetails")
	public List<OwnerDetails> getOwnerDetails(){
		
		List<OwnerDetails> list=service.getOwnerDetails();
		
		return list;
		
	}
	
	@GetMapping(path="/cakes/cakesDescription")
	public List<CakeDescription> getDescription(){
	
		List<CakeDescription> list=service.getCakeDescription();
		return list;
		
	}
	
	
	@PostMapping(path="/cake/addCakes")
	public ResponseEntity<Object>  insertNewCakeInMenu(@RequestBody CakeDescription cake){
		
		StringBuffer message=new StringBuffer("New Cake addition is ");
		
		System.out.println("cakes added");
		
		boolean flag=service.getNewCakeInMenu(cake);
		if(flag){
			message.append("added Successfully");
		}else{
			message.append("not added,Error is occured");
		}
		
		URI loc=ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("{message}")
				.buildAndExpand(cake.getCakeName())
				.toUri();
		
		System.out.println("created:"+loc);
		
		return ResponseEntity.created(loc).build();
     
		
	}
		
	

}
