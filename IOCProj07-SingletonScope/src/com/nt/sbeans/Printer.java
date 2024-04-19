package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Printer 
{
	// static reference

	private static Printer obj;
	
	private Printer() {
		System.out.println("Printer Class with 0 Parameters");
	}
	
	//public static factory method having singleton logic
	public static Printer getObject() {
		if(obj==null) 
			obj=new Printer();
		
		return obj;
	}
	public void printMessage(String msg) {
		System.out.println(msg);
	}
	
}
