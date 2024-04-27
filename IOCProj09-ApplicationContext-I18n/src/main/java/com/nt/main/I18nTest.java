package com.nt.main;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Config.AppConfig;

public class I18nTest 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx= 
        		new AnnotationConfigApplicationContext(AppConfig.class);
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Language code");
        String lang=sc.next();
        System.out.println("Enter Country code");
        String country=sc.next();
        
        Locale loc=new Locale(lang,country);
        
        String msg1=ctx.getMessage("welcome.message",new Object[] {"Pavan"},loc);
        String msg2=ctx.getMessage("goodbye.message",new Object[] {},loc);
        String msg3=ctx.getMessage("newyear.wishes",new Object[] {},loc);
        
        System.out.println(msg1+"====>"+msg2+"====>"+msg3);
        
        ctx.close();
        sc.close();
        
    }
}
