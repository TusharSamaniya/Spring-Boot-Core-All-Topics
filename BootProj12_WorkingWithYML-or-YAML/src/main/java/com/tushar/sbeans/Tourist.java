package com.tushar.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("tourist")
@ConfigurationProperties(prefix="trst.info")
public class Tourist {
	
	private Integer tid;
	private String tname;
	private String fromPlace;
	private String toPlace;
	private Double budget;
	private String packageType;
}
