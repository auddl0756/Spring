package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.ChangePaswordService;
import spring.MemberDao;
import spring.MemberListPrinter;
import spring.MemberPrinter;
import spring.MemberRegisterService;

@Configuration
public class AppContext {
	@Bean 
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao());
	}
	
	@Bean
	public ChangePaswordService changePwdSvc() {
		ChangePaswordService pwdSvc = new ChangePaswordService();
		pwdSvc.setMemberDao(memberDao());
		return pwdSvc;
	}
	
	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}
	
	@Bean 
	public MemberListPrinter listPrinter() {
		return new MemberListPrinter(memberDao(),memberPrinter());
	}
	
}
