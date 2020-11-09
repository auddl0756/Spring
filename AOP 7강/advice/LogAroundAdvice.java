package aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor{
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		//곁다리 업무
		long start = System.currentTimeMillis();	
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//주업무 호출
		Object result = invocation.proceed();	
		
		//곁다리 업무
		long end =System.currentTimeMillis();
		String message =(end-start) +" ms가 걸렸음";
		System.out.println(message);
		
		return result;
	}
}