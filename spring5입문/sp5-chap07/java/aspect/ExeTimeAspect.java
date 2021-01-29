package aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

//핵심기능은 다른 객체에 위임하고 부가적인 기능을 제공하는 개체가 프록시.
//Aspect -> 공통기능을 제공하는 클래스.
//@Aspect 어노테이션을 적용한 클래스는 Advice와  Pointcut을 함께 제공한다.
@Aspect
public class ExeTimeAspect {
	
	//execution 명시자는 advice를 적용할 메서드를 지정할 때 사용
	//* means 'all'
	//.. means '0개 이상'
	//[example]
	//execution(* read*(Integer,..))	:read로 시작하는 메서드명을 가졌고, 1번째 파라미터는 Integer이며 1개 이상의 파라미터를 갖는 메서드 호출
	//execution(* get*(*)) : 이름이 get으로 시작하고 파라미터가 1개인 메서드 호출
	//execution(* chap07..*.*(..)) : chap07 패키지 및 하위 패키지에 있는 파라미터가 0개 이상인 메서드 호출
	
	//execution(접근제어자, 반환형,패키지를 포함한 클래스 경로,메소드 파라미터)
	//@Pointcut("execution(* *(..))")
	//Pointcut : 공통 기능을 적용할 대상 설정.
	@Pointcut("execution(public * chap07..*(..))")
	private void publicTarget() {
		
	}
	
	//publicTarget()메서드가 정의한 Pointcut에 공통기능을 적용.
	
	@Around("publicTarget()")
	public Object measure(ProceedingJoinPoint joinPoint) throws Throwable{
		long start=System.nanoTime();
		try {
			
			//핵심 기능 수행하는 건 proceed()하면 핵심 기능 부분 처리해서 반환해 줌.
			Object res = joinPoint.proceed();
			return res;
		}finally {
			long finish=System.nanoTime();
			
			//호출되는 대상 메서드(코어 로직)에 대한 정보
			Signature sig = joinPoint.getSignature();
			System.out.println("jointPoint: "+joinPoint.getTarget().getClass().getSimpleName());
			System.out.println("signame: "+sig.getName());
			System.out.println("joinPoint args:"+Arrays.toString(joinPoint.getArgs()));
			
			System.out.println("excution time : "+(finish-start));
		}
	}
 	
}
