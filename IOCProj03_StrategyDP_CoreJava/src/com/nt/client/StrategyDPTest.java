package com.nt.client;

import com.nt.components.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) 
	{
		Flipkart fpkt=FlipkartFactory.getInstance("dtdc");
		String resultMsg=fpkt.shopping(new String[] {"Shirt","trouser"},
							new double[] {2000,5000});
		System.out.println(resultMsg);
	}

}
