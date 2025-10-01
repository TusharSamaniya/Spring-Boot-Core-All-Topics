package com.tushar.runners;

import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(10)
public class TestRunner2 implements ApplicationRunner {
	

	public TestRunner2() {
		System.out.println("TestRunner2: 0 param constructor");
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("TestRunner2.run()(AR)");
		
		System.out.println("Non-option args: " + args.getNonOptionArgs());
		Set<String> names =args.getOptionNames();
		System.out.println("Option args are");
		for(String name: names) {
			System.out.println(name + "...."+ args.getOptionValues(name));
		}

		System.out.println("-----------------------------------");
	}

}
