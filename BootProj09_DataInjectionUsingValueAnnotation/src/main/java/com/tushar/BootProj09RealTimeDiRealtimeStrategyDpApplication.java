package com.tushar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tushar.beans.HotelInfo;

@SpringBootApplication
public class BootProj09RealTimeDiRealtimeStrategyDpApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj09RealTimeDiRealtimeStrategyDpApplication.class, args);
		
		HotelInfo info = ctx.getBean("hotel",HotelInfo.class);
		System.out.println(info);
		
		System.out.println("bill amount after discount " + info.calculateDiscount(200.0f));
	}

}
