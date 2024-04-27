package com.nt.client;

import com.nt.singleton.Printer;

public class SingletonDPTest 
{
	public static void main(String[] args) 
	{
		Printer printer1=Printer.getObject();
		Printer printer2=Printer.getObject();
		Printer printer3=Printer.getObject();
		
		System.out.println(printer1.hashCode());
		System.out.println(printer2.hashCode());
		System.out.println(printer3.hashCode());
		System.out.println("printer1==printer2:"+(printer1==printer2));
		System.out.println("printer2==printer3:"+(printer1==printer2));
	}
}
