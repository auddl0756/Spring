package aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.entity.Exam;
import aop.entity.NewlecExam;

public class Program {
	public static void main(String[] args) {

//		ApplicationContext context 
//		=new AnnotationConfigApplicationContext(appConfig.class);
		
		ApplicationContext context
		= new ClassPathXmlApplicationContext("aop/setting.xml");
		
		Exam proxy = (Exam) context.getBean("proxy");
		System.out.println(proxy.total()+" "+proxy.average());
		
		//주업무 내용만 호출.
//		Exam exam = (Exam) context.getBean("exam");
//		System.out.println(exam.total()+" "+exam.average());
		
	

		
	}
}
