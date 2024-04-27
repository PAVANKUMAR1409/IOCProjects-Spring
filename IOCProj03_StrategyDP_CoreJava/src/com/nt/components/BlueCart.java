package com.nt.components;

public class BlueCart implements Courier
{
	@Override
	public String delivery(int oid) {
		
		return "BlueCart courier is ready for delivery "+oid+" order number products";
	}
}
