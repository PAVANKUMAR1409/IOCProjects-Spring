package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dtdc")
@Lazy(true)
public final class DTDC implements Courier
{
	public DTDC() {
		System.out.println("DTDC 0-param constructor");
	}
	
	
	@Override
	public String delivery(int oid) {
		
		return "DTDC courier is ready for delivery "+oid+" order number products";
	}
}
