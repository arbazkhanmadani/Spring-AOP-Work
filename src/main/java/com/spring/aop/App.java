package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.services.PaymentServiceImpl;

public class App{
	
	public static void main( String[] args ){
    	
		System.out.println( "Hello World!" );
    
		ApplicationContext app = new ClassPathXmlApplicationContext("aop-config.xml");
		PaymentServiceImpl ps = (PaymentServiceImpl)app.getBean("psi" ,PaymentServiceImpl.class);
		ps.makeOrder();
	}
}
