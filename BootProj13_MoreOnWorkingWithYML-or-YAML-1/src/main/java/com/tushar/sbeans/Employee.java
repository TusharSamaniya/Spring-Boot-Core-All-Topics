package com.tushar.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("emp")
@ConfigurationProperties(prefix="emp.details")
public class Employee {
	
	//simple properties
	private Integer eno;
	private String enam;
	private String eaddrs;
	
	//array properties
	private String[] favColors;
	
	//collection properties
	private List<String> nickNames;
	private Set<Long> phoneNumbers;
	private Map<String, Long> idDetails;
	
	//HAS-A Property
	private Project project;
	

}
