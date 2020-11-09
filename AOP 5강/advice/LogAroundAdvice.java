package aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor{
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		//��ٸ� ����
		long start = System.currentTimeMillis();	
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//�־��� ȣ��
		Object result = invocation.proceed();	
		
		//��ٸ� ����
		long end =System.currentTimeMillis();
		String message =(end-start) +" ms�� �ɷ���";
		System.out.println(message);
		
		return result;
	}
}