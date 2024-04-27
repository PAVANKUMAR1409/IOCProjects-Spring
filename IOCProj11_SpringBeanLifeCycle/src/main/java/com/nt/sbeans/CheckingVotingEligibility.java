package com.nt.sbeans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("voter")
@PropertySource("com/nt/commons/info.properties")
public class CheckingVotingEligibility {
	
	@Value("${voter.id}")
	private Integer id;
	@Value("${voter.name}")
	private String name;
	@Value("${voter.age}")
	private Integer age;
	
	private Date verifiedOn;
	
	public CheckingVotingEligibility() {
		System.out.println("CheckingVotingEligibility::0-Param Constructor");
	}
	
	@PostConstruct
	public void myInit() {
		System.out.println("CheckingVotingEligibility.myInit()");
		verifiedOn=new Date();
		//System.out.println("name"+name+"h");
		if(name==null || age<=0)
			throw new IllegalArgumentException("set correct values to name,age in info.properties");
	}
	
	public String CheckEligibility() {
		System.out.println("CheckingVotingEligibility.CheckEligibility()");
//		System.out.println("id==>"+id);
//		System.out.println("name==>"+name);
//		System.out.println("age==>"+age);
//		System.out.println("verifiedOn==>"+verifiedOn);
		if(age<18)
			return "Mr./Mrs/Miss "+name+" you are not eligible for voiting===>VerifiedOn : "+verifiedOn;
		else
			return "Mr./Mrs/Miss "+name+" you are eligible for voiting===>VerifiedOn : "+verifiedOn;
	}
	
	@PreDestroy
	public void destory() {
		System.out.println("CheckingVotingEligibility.destory()");
		name=null;
		age=null;
		verifiedOn=null;
		id=null;
	}

}
