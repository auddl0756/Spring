package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.ChangePaswordService;
import spring.MemberDao;
import spring.MemberInfoPrinter;
import spring.MemberListPrinter;
import spring.MemberPrinter;
import spring.MemberRegisterService;

@Configuration
@ComponentScan(basePackages= {"spring"})
public class AppConfigure2 {
	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	//@Qualifier("summaryPrinter")
	@Qualifier("printer")
	private MemberPrinter memberPrinter;
	
//	@Bean
//	public MemberRegisterService memberRegSvc() {
//		return new MemberRegisterService(memberDao);			
//	}
	
	@Bean
	//public MemberRegisterService memberRegSvc() {
	//@Component annotation에 값을 주지 않고 빈으로 등록하려면 클래스 이름의 첫글자를 소문자로 바꾼 빈 이름을 사용해야 한다.
	public MemberRegisterService memberRegisterService() {	
		return new MemberRegisterService(memberDao);			
	}
	
	@Bean
	//public ChangePaswordService changePwdSvc() {
	public ChangePaswordService changePaswordService() {
//		ChangePaswordService pwdSvc = new ChangePaswordService();
//		pwdSvc.setMemberDao(memberDao);
//		return pwdSvc;
		return new ChangePaswordService();
	}
	
	@Bean
	public MemberListPrinter listPrinter() {
		return new MemberListPrinter(memberDao, memberPrinter);
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter() {
//		MemberInfoPrinter infoPrinter =new MemberInfoPrinter();
//	using @Autowired at MemberInfoPrinter.java's printMemberInfo method, setter method doesn't need now.
//		infoPrinter.setMemberDao(memberDao);
//		infoPrinter.setPrinter(memberPrinter);
//		return infoPrinter;
		return new MemberInfoPrinter();
	}

}
