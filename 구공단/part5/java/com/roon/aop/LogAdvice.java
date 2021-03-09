package com.roon.aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

@Aspect
@Log4j
@Component
public class LogAdvice {
	@Before("execution(* com.roon.service.SampleService*.*(..))")
	public void logBefore() {
		log.info("==============");
	}
	 
	@Before("execution(* com.roon.service.SampleService*.doAdd(String,String)) "
			+ "&& args(s1,s2)")
	public void logBeforeWithParam(String s1,String s2) {
		log.info("s1 = "+s1);
		log.info("s2 = "+s2);
	}
	
	@AfterThrowing(pointcut="execution(* com.roon.service.SampleService*.*(..))",
			throwing="exception")
	public void logException(Exception exception) {
		log.info("exception occured!!!!!!!!");
		log.info("exception  = "+exception);
	}
} 
