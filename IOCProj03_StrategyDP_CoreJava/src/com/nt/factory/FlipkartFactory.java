package com.nt.factory;

import com.nt.components.BlueCart;
import com.nt.components.Courier;
import com.nt.components.DTDC;
import com.nt.components.Flipkart;

public class FlipkartFactory 
{
	
	// static factory method
	public static Flipkart getInstance(String courierType) {
		Courier courier=null;
		if(courierType.equalsIgnoreCase("DTDC")) 
			courier=new DTDC();
		else if(courierType.equalsIgnoreCase("BlueCart"))
			courier =new BlueCart();
		else
			throw new IllegalArgumentException("Invalid courier type");
		
		Flipkart fpkt=new Flipkart();
		fpkt.setCourier(courier);
		return fpkt;
		
	} 
}
