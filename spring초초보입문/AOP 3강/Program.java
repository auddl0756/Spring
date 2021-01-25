package aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import aop.entity.Exam;
import aop.entity.NewlecExam;

public class Program {
	public static void main(String[] args) {
		
		Exam exam = new NewlecExam(1,1,1,1);
		
	Exam proxy= (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), new Class[] {Exam.class},
			new InvocationHandler() {
				
				@Override
				public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
					
					long start = System.currentTimeMillis();	
					Object result=method.invoke(exam, args);
					
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					long end =System.currentTimeMillis();
					String message =(end-start) +" ms가 걸렸음";
					System.out.println(message);
					
					return result;
				}
			});
		
	
//		System.out.println(exam.total()+" "+exam.average());
		//proxy이용.
		System.out.println(proxy.total()+" "+proxy.average());
		
		
	}
}
