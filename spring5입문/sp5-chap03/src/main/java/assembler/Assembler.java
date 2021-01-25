package assembler;

import spring.ChangePaswordService;
import spring.MemberDao;
import spring.MemberRegisterService;

public class Assembler {
	private MemberDao memberDao;
	private MemberRegisterService regservice;
	private ChangePaswordService passwdservice;
	
	public Assembler() {
		memberDao = new MemberDao();
		regservice = new MemberRegisterService(memberDao);
		passwdservice = new ChangePaswordService();	
		passwdservice.setMemberDao(memberDao);
	}
	
	public MemberDao getMemberDao() {
		return memberDao;
	}
	
	public MemberRegisterService getMemberRegisterService() {
		return regservice;
	}
	
	public ChangePaswordService getChangePasswordService() { 
		return passwdservice;
	}
}
