package com.tushar.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner1 implements CommandLineRunner {
	
	

	public TestRunner1() {
		System.out.println("TestRunner1: 0 param constructor");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("TestRunner1.run()(CLR)");
		System.out.println("The args are : " + Arrays.toString(args));
		
		System.out.println("-----------------");

	}

}
