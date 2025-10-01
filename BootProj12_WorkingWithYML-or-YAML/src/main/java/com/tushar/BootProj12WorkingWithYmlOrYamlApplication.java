package com.tushar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.tushar.sbeans.Tourist;

@SpringBootApplication
public class BootProj12WorkingWithYmlOrYamlApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj12WorkingWithYmlOrYamlApplication.class, args);
		Tourist trst = ctx.getBean("tourist",Tourist.class);
		System.out.println("TouristData: " + trst);
		((ConfigurableApplicationContext) ctx).close();
	}

}
