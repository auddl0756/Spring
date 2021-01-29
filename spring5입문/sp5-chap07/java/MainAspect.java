

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import chap07.Calculator;
import chap07.RecursiveCalculator;
import config.AppContext;

public class MainAspect {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppContext.class);
		Calculator cal = ctx.getBean("calculator",Calculator.class);
		
		
		//below makes error
		//:	spring makes proxy using interface of class you set. 
		//	so if you give RecursiveCalculator.class, spring makes proxy
		//	using Calculator which is interface of this,so actual Bean type of cal
		//  become Proxy type which implements Calculator type. It is not same with RecursiveCalculator type.
		
		//  you can fix error using proxyTargetClass=true at @EnableAspectJAutoProxy(at AppContext.java)
		//	which means making proxy extending class, not implementing interface.
		
		//RecursiveCalculator cal = ctx.getBean("calculator",RecursiveCalculator.class);
		
		
		//cal = 스프링 컨테이너가 가지고 있는 bean을 반환 받은 것.(설정클래스 가보면 recursiveCalculator 객체 리턴함)
		//cal.factorial()하면 -> 일단 $Proxy가 낚아챔.
		//$Proxy는 스프링이 알아서 만든거임. 
		//$Proxy는 recursiveCalculator 객체의 인터페이스를 또 따로 자기가 구현함. 그래서 recursiveCalulator 타입이 아니라 프록시타입임
		//$Proxy는 공통기능 부분을 수행하도록 함.(@Aspect 붙은 클래스,여기선 ExeTimeAspect.java)
		//Pointcut과 Advice보고 적용 메서드 찾고, 공통 기능 좀 수행하다가
		//핵심 기능 수행하라고 joinPoint.proceed() 호출함. 그럼 핵심 기능 부분 수행됨.
		//그러고 나서 나머지 공통 기능 처리마치면 $proxy로 결과 반환되고
		//$proxy에서 main함수에서 호출한 곳으로 반환됨.
		long fiveFact = cal.factorial(5);
		
		System.out.println("cal.factorial(5) = "+fiveFact);
		System.out.println(cal.getClass().getName());
		ctx.close();
	}
}
