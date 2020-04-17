package com.spring.IOC;

public class Vodafone implements Sim {

	@Override
	public void calling() {
		
		System.out.println("Calling Using Vodafone Sim");
		
	}

	@Override
	public void Data() {
		
		System.out.println("Using Data @40Mbps");
		
	}
	

}
