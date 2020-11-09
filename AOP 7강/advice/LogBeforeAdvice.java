package aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeAdvice implements MethodBeforeAdvice{
	
	//core concern이 실행되기 전에 처리할 로직.
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		
		System.out.println("앞에서 실행될 로직");
		
	}
	
}
