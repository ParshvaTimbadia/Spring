package com.spring.IOC;

public class Airtel implements Sim {

	@Override
	public void calling() {
		
		System.out.println("Calling Using Airtel Sim");
		
	}

	@Override
	public void Data() {
		
		System.out.println("Using Data @50Mbps");
		
	}
	

}
