package aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeAdvice implements MethodBeforeAdvice{
	
	//core concern�� ����Ǳ� ���� ó���� ����.
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		
		System.out.println("�տ��� ����� ����");
		
	}
	
}
