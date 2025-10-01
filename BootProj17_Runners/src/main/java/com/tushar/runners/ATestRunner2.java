package com.tushar.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ATestRunner2 implements CommandLineRunner {
	
	

	public ATestRunner2() {
		System.out.println("TestRunner1: 0 param constructor");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ATestRunner2.run()(CLR)");
		System.out.println("The args are : " + Arrays.toString(args));
		
		System.out.println("-----------------");

	}

}
