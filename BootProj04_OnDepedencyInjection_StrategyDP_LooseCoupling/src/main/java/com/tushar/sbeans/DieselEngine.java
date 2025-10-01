package com.tushar.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("diesel")
@Lazy
public final class DieselEngine implements iEngine {

	public DieselEngine() {
		System.out.println("DieselEngine.DieselEngine():: 0-param constuctor");
	}

	@Override
	public void start() {
		System.out.println("DieselEngine.start(): Diesel Engine is start");

	}

	@Override
	public void stop() {
		System.out.println("DieselEngine.stop(): Diesel Engine is stop");

	}

}
