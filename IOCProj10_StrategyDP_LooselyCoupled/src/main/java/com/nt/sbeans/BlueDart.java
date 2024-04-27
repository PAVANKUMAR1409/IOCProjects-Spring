package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bDart")
@Lazy(true)
public final class BlueDart implements Courier
{
	public BlueDart() {
		System.out.println("BlueDart 0-param constructor");
	}
	@Override
	public String delivery(int oid) {
		
		return "BlueDart courier is ready for delivery "+oid+" order number products";
	}
}
