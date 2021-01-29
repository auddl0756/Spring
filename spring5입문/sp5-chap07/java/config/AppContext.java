package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aspect.ExeTimeAspect;
import chap07.Calculator;
import chap07.RecursiveCalculator;

@Configuration
@EnableAspectJAutoProxy		//@Enable ~는 관련 기능을 적용하는데 필요한 스프링 설정을 대신 처리해준다
//@EnableAspectJAutoProxy(proxyTargetClass=true)
public class AppContext {
	@Bean
	public ExeTimeAspect exeTimeAspect() {
		return new ExeTimeAspect();
	}
	
	@Bean
	public Calculator calculator() {
		return new RecursiveCalculator();
	}
}
