package com.spring.aop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PaymentAspect {

	@Before("execution(* com.spring.aop.services.PaymentServiceImpl.makeOrder())")
	public void beforePayment(){
		System.out.println("before payment..............");
	}
	
	//execution(* com.spring.aop.services.PaymentServiceImpl.makePayment())
	//execution(* com.spring.aop.services.PaymentServiceImpl.*) => All methods.
	//* => all data type and Modifier.
	@After("execution(* com.spring.aop.services.PaymentServiceImpl.makeOrder())")
	public void afterPayment(){
		System.out.println("after payment..............");
	}
}
