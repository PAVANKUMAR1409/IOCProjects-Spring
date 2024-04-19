//Target Class
package com.nt.components;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	//HAS-A-PROPERTY
	private Courier courier;
	
	//constructor
	public Flipkart() {
		System.out.println("Flipkart with 0-param");
	}

	//setter method for assignment
	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	
	//business logic
	public String shopping(String items[],double prices[])
	{
		//calculate bill amount
		double billAmt=0.0;
		for(double p:prices) {
			billAmt+=p;
		}
		//generating random order id
		int oid=new Random().nextInt(1000);
		//deliver the order using courier
		String msg=courier.delivery(oid);
		return Arrays.toString(items)+" are shopped having "+billAmt+"===>"+msg;
	}
}
