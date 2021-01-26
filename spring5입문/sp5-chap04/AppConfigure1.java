package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.MemberDao;
import spring.MemberPrinter;
import spring.MemberSummaryPrinter;

@Configuration
public class AppConfigure1 {
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
//	@Bean
//	public MemberPrinter memberPrinter() {
//		return new MemberPrinter();
//	}
	
	//Qualifier : 자동 주입이 가능한 빈이 2개 이상이면 자동 주입할 빈을 지정할 수 있도록 하는 방법
	//Qualifier가 없으면 빈의 이름이 한정자가 된다.

	@Bean
	@Qualifier("printer")
	public MemberPrinter memberPrinter1() {
		return new MemberPrinter();
	}
	
	@Bean
	@Qualifier("summaryPrinter")
	public MemberSummaryPrinter memberPrinter2() {
		return new MemberSummaryPrinter();
	}
}
