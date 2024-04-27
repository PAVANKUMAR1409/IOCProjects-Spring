//AppConfig.java(configuration class)
package com.nt.config;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nt.sbeans.Printer;

@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
public class AppConfig 
{
	@Bean(name="ldt")
	public LocalDateTime createLDT()
	{
		return LocalDateTime.now();
	}
	
	@Bean(name="dt1")
	public Date getDate1() {
		return new Date();
	}
	
	@Bean(name="dt2")
	public Date getDate2() {
		return new Date();
	}
	
	@Bean("print1")
	public Printer printer1() {
		return Printer.getObject();
	}
	
	@Bean("print2")
	public Printer printer2() {
		return Printer.getObject();
	}
}
