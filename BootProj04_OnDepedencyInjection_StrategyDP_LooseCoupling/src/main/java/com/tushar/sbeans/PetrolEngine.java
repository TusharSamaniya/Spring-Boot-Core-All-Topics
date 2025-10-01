package com.tushar.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("petrol")
@Lazy
public final class PetrolEngine implements iEngine {

	public PetrolEngine() {
		System.out.println("PetrolEngine.PetrolEngine()::0-param constructor");
	}

	@Override
	public void start() {
		System.out.println("PetrolEngine.start(): Petrol Engine is start");

	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine.stop(): Petrol Engine is stop");

	}

}
