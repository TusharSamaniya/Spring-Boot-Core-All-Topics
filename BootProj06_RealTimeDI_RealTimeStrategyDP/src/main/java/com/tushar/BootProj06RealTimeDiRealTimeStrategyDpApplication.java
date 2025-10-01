package com.tushar;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.tushar.controller.CollegeOperationsController;
import com.tushar.model.Employee;

@SpringBootApplication
public class BootProj06RealTimeDiRealTimeStrategyDpApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj06RealTimeDiRealTimeStrategyDpApplication.class, args);
		
		//get controller class object
		CollegeOperationsController controller = ctx.getBean("clgOperation",CollegeOperationsController.class);
		
		//invoke the b.method
		try {
			List<Employee> list = controller.showEmployeeByDesg("CLERK", "MANAGER", "CLERK");
			list.forEach(emp->{
				System.out.println(emp);
			});
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		((ConfigurableApplicationContext) ctx).close();
	}

}
