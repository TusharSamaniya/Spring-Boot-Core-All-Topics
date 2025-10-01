package com.tushar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.tushar.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/tushar/cfgs/applicationContext.xml")
public class BootProj02OnDepedencyInjectionStrategyDpApplication {

	public static void main(String[] args) {
		//get IOC container
		try(ConfigurableApplicationContext ctx = SpringApplication.run(BootProj02OnDepedencyInjectionStrategyDpApplication.class, args);)
		{
			//get target class object
			Vehicle vehicle = ctx.getBean("vehicle", Vehicle.class);
			
			//invoke the b.method
			vehicle.journey("hyd", "delhi");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
