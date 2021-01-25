package aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LogAfterReturningAdvice implements AfterReturningAdvice{
	
	//logBeforeAdvice�� ȣ��� �Ŀ� �� ���ϰ��� ó���� ����..
	
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("return value = "+returnValue+" , method: "+method.getName());
		
	}
	
}
