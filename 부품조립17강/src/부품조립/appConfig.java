package ��ǰ����;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ��ǰ����.entity.Exam;
import ��ǰ����.entity.NewlecExam;

//setting.xml�� ��ü�ϴ� ���� class 

@Configuration
@ComponentScan("��ǰ����.ui")
public class appConfig {
	
	@Bean
	public Exam exam() {
		return new NewlecExam(); 
	}
	 
}
