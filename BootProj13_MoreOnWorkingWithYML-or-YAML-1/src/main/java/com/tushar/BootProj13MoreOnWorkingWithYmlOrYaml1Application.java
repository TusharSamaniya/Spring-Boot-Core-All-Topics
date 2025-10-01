package com.tushar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tushar.sbeans.Employee;

@SpringBootApplication
public class BootProj13MoreOnWorkingWithYmlOrYaml1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootProj13MoreOnWorkingWithYmlOrYaml1Application.class, args);
		
		Employee emp = ctx.getBean("emp",Employee.class);
		System.out.println(emp);
		ctx.close();
	}

}
