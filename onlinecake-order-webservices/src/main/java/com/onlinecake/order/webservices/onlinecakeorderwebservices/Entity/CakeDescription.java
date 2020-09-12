package com.onlinecake.order.webservices.onlinecakeorderwebservices.Entity;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/*@Component
@ConfigurationProperties
@PropertySource(value = { "file: F:/development/workspacePractice/CakeDescription.properties" })*/

@Component
@Validated
public class CakeDescription {
	String cakeName;
	String cakeflavour;
	int Quantity;
	float price;
	
	public String getCakeName() {
		return cakeName;
	}
	public void setCakeName(String cakeName) {
		this.cakeName = cakeName;
	}
	public String getCakeflavour() {
		return cakeflavour;
	}
	public void setCakeflavour(String cakeflavour) {
		this.cakeflavour = cakeflavour;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	

}
