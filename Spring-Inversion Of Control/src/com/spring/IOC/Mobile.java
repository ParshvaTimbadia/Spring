// @Author: ParshvaTimbadia
package com.spring.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Airtel air=new Airtel();
		air.calling();
		air.Data();
		
		Vodafone voda = new Vodafone();
		voda.calling();
		voda.Data();
		
		NOTE: TO ADD
		
		*/
		
		ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
		/*
		 
		  
		  NOTE: ADD here
		  
		  
		  
		  */
		System.out.println("Configured");
		
		
		Sim s= context.getBean("sim",Sim.class);
		
		// NOTE: On getBean Method.
		
		s.calling();
		s.Data();
		
		
		
		
				
	}

	private static Sim getBeans() {
		// TODO Auto-generated method stub
		return null;
	}

}
