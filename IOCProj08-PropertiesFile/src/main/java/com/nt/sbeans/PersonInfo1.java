package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component("pinfo1")
public class PersonInfo1 
{
	@Autowired
	private Environment env;
	
	public void show() {
		System.out.println("os-name==>"+env.getProperty("os.name"));
		System.out.println("os-version==>"+env.getProperty("os.version"));
	}
}
