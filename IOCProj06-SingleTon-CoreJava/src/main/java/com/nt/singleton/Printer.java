package com.nt.singleton;

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
