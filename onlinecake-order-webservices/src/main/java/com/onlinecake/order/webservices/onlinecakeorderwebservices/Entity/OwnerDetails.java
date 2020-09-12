package com.onlinecake.order.webservices.onlinecakeorderwebservices.Entity;

public class OwnerDetails {
	
   String name;
   String emailId;
   String phone;
   String address;

public OwnerDetails(String name, String emailId, String phone, String address) {
	super();
	this.name = name;
	this.emailId = emailId;
	this.phone = phone;
	this.address = address;
}

public String getName() {
	return name;
}

public String getEmailId() {
	return emailId;
}

public String getPhone() {
	return phone;
}

public String getAddress() {
	return address;
}


	
	
	

}
