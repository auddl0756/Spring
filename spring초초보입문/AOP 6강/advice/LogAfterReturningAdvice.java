package aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LogAfterReturningAdvice implements AfterReturningAdvice{
	
	//logBeforeAdvice가 호출된 후에 그 리턴값의 처리에 대한..
	
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("return value = "+returnValue+" , method: "+method.getName());
		
	}
	
}
