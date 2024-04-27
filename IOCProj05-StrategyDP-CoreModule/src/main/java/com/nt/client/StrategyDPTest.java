package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) 
	{
		//creating ioc container
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		//get target spring bean class object
		Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		
		//invoke business method
		String resultMsg=fpkt.shopping(new String[] {"Shirts","Jeans"},
													new double[] {2000,5000});
		
		System.out.println(resultMsg);
		ctx.close();
	}

}
