package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pinfor")
@PropertySource("com/nt/commons/info.properties")
public class PersonInfo
{
	@Value("123456789")// direct value injection
	private long aadharNumber;
	
	//injecting the properties values
	@Value("${per.id}")
	private Integer pid;
	@Value("${per.name}")
	private String pname;
	@Value("${per.address}")
	private String address;
	@Value("${per.phno}")
	private Long phno;
	
	// injecting the System properties
	@Value("${os.name}")
	private String osName;
	@Value("${os.version}")
	private String osVersion;
	
	//injecting the Environmental Values
	@Value("${Path}")
	private String pathData;

	@Override
	public String toString() {
		return "PersonInfo [aadharNumber=" + aadharNumber + ",\n pid=" + pid + ",\n pname=" + pname + ",\n address=" + address
				+ ",\n phno=" + phno + ",\n osName=" + osName + ",\n osVersion=" + osVersion + ",\n pathData=" + pathData + "]";
	}
	
	
}
