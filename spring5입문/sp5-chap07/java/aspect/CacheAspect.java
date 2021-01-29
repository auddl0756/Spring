package aspect;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CacheAspect {
	private Map<Long,Object> cache = new HashMap<>();
	
	@Pointcut("execution(public * chap07..*(long))")
	public void cacheTarget() {
		
	}
	
	@Around("cacheTartget()")
	public Object execute(ProceedingJoinPoint joinPoint) throws Throwable{
		Long num=(Long) joinPoint.getArgs()[0];
		if(cache.containsKey(num)) {
			System.out.println("cache에서 get: "+num);
			return cache.get(num);
		}
		
		Object res=joinPoint.proceed();
		cache.put(num, res);
		System.out.println("CacheAspect에 추가: "+num);
		return res;
	}
}
