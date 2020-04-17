package com.spring.IOC;

public class JIO implements Sim {

	@Override
	public void calling() {
		
		System.out.println("Calling Using JIO Sim");
		
	}

	@Override
	public void Data() {
		
		System.out.println("Using Data @100Mbps");
		
	}
	

}
