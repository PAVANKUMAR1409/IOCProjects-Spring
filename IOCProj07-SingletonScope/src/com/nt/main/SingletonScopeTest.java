//DependencyInjectionTest.java
package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Printer;

public class SingletonScopeTest {

	public static void main(String[] args) {
		//create IOC Container
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
//		WishMessageGenerator wmg=ctx.getBean("wishMessageGenerator",WishMessageGenerator.class);
//		WishMessageGenerator wmg1=ctx.getBean("wishMessageGenerator",WishMessageGenerator.class);
//		WishMessageGenerator wmg2=ctx.getBean("wishMessageGenerator",WishMessageGenerator.class);
//		
//		System.out.println(wmg.hashCode()+"  "+wmg1.hashCode()+"  "+wmg2.hashCode());
//		System.out.println("wmg==wmg1==>"+(wmg==wmg1));
//		System.out.println("wmg2==wmg1==>"+(wmg2==wmg1));
//		System.out.println("wmg2==wmg==>"+(wmg2==wmg));
//		
//		Date dt11=ctx.getBean("dt1",Date.class);
//		Date dt12=ctx.getBean("dt1",Date.class);
//		System.out.println(dt11.hashCode()+"   "+dt12.hashCode());
//		
//		
//		LocalDateTime ldt1=ctx.getBean("ldt",LocalDateTime.class);
//		LocalDateTime ldt2=ctx.getBean("ldt",LocalDateTime.class);
//		System.out.println(ldt1.hashCode()+"   "+ldt2.hashCode());
//		
//		String date=wmg.sysDate();
//		System.out.println(date);
		
		
		Printer p1=ctx.getBean("print1",Printer.class);
		Printer p2=ctx.getBean("print1",Printer.class);
		System.out.println(p1.hashCode()+"   "+p2.hashCode());
		//close the container
		ctx.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
