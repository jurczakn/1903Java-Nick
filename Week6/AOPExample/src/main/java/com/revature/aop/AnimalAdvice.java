package com.revature.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnimalAdvice {
	//vv-Type of Advice
	@Before("execution(void com.revature.services.MonkeyService.eatBananas())")//<---PointCut describing advice
	public void beforeEatBananas() {
		System.out.println("The monkey is about to eat a banana");
	}
	
	@After("execution(* com.revature.services.MonkeyService.*(..))")
	public void afterMonkey() {
		System.out.println("The Monkey just did something, wasn't that neat?");
		System.out.println("");
	}
	
	@Before("execution(* *.climb*(..))")
	public void beforeClimb() {
		System.out.println("Something is about to be climbed");
	}
}
