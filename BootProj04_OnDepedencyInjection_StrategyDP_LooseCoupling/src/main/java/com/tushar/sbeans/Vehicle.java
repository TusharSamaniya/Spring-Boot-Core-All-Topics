package com.tushar.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	
	@Autowired
	@Qualifier("engg")
	private iEngine engine;

	public Vehicle() {
		System.out.println("Vehicle::0-param constructor");
	}
	
	public void journey(String startPlace, String endPlace) {
		System.out.println("Vehicle.journey()");
		//start the engine to start the journey
		engine.start();
		System.out.println("Vehicle.journey() started from " + startPlace);
		
		System.out.println("Vehicle.journey() journey is going on... ");
		
		engine.stop();
		System.out.println("Vehicle.journey() end at " + endPlace);
	}

}
