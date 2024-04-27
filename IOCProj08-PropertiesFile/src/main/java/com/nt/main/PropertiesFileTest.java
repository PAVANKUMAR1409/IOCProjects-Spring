package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.Config.AppConfig;
import com.nt.sbeans.PersonInfo;
import com.nt.sbeans.PersonInfo1;

public class PropertiesFileTest 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx=
        		new AnnotationConfigApplicationContext(AppConfig.class);
        
        //get spring bean class object reference
        PersonInfo pinfo=ctx.getBean("pinfor",PersonInfo.class);
        System.out.println(pinfo);
        
        //Environment Class Object
        Environment env=ctx.getEnvironment();
        System.out.println(env.getProperty("os.name"));
        System.out.println(env.getProperty("os.version"));
        
        PersonInfo1 p1=ctx.getBean("pinfo1",PersonInfo1.class);
        p1.show();
        
        //closing the IOC Container
        ctx.close();
    }
}
