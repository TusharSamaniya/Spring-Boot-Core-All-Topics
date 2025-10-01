package com.tushar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.tushar.sbeans.Employee;

@SpringBootApplication
public class BootProj11InjectingSpecialValuesToSpringbeanPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj11InjectingSpecialValuesToSpringbeanPropertiesApplication.class, args);
		Employee emp = ctx.getBean("emp", Employee.class);
		System.out.println(emp);
		((ConfigurableApplicationContext) ctx).close();
	}

}
