package com.nt.components;

public class DTDC implements Courier
{
	@Override
	public String delivery(int oid) {
		
		return "DTDC courier is ready for delivery "+oid+" order number products";
	}
}
