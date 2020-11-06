package 부품조립;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import 부품조립.entity.Exam;
import 부품조립.entity.NewlecExam;

//setting.xml을 대체하는 설정 class 

@Configuration
@ComponentScan("부품조립.ui")
public class appConfig {
	
	@Bean
	public Exam exam() {
		return new NewlecExam(); 
	}
	 
}
