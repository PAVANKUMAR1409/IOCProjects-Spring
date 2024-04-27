package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Config.AppConfig;
import com.nt.sbeans.CheckingVotingEligibility;

public class SpringBeanLifeCycleTest 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext ctx=
    		   new AnnotationConfigApplicationContext(AppConfig.class);
       
       CheckingVotingEligibility voter=
    		   ctx.getBean("voter",CheckingVotingEligibility.class);
       
       try {
    	   String result=voter.CheckEligibility();
    	   System.out.println(result);
       }catch(Exception e) {e.printStackTrace();}
       
       ctx.close();
    }
}
