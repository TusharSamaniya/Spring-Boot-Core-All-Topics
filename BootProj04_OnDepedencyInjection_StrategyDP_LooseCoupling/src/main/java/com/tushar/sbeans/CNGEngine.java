package com.tushar.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("cng")
@Lazy
public final class CNGEngine implements iEngine {
	
	

	public CNGEngine() {
		System.out.println("CNGEngine.CNGEngine()::0-param constructor");
	}

	@Override
	public void start() {
		System.out.println("CNGEngine.start(): CNG Engine is start");

	}

	@Override
	public void stop() {
		System.out.println("CNGEngine.stop(): CNG Engine is stop");

	}

}
