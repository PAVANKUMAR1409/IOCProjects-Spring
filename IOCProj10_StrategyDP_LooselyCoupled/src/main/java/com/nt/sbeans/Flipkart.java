//Target Class
package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("fpkt")
public final class Flipkart {
	
	//HAS-A-PROPERTY
	@Qualifier("shipment")
	@Autowired
	private Courier courier;
	
	//constructor
	public Flipkart() {
		System.out.println("Flipkart with 0-param");
	}

	//business method
	public String shopping(String items[],double prices[])
	{
		System.out.println("Flipkart.shopping()");
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
