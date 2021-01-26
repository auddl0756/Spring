package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("infoPrinter") 
public class MemberInfoPrinter {
	private MemberDao memDao;
	private MemberPrinter printer;
	//생성자를 안 쓰고 setter로 di하는 방식.

	
	public void printMemverInfo(String email) {
		Member member = memDao.selectByEmail(email);
		if(member==null) {
			System.out.println("no data with this email:"+email);
			return;
		}
		
		printer.print(member);
		System.out.println();
	}
	
	@Autowired
	public void setMemberDao(MemberDao memberDao) {
		this.memDao=memberDao;
	}
	
	@Autowired
	@Qualifier("printer")
	public void setPrinter(MemberPrinter printer) {
		this.printer =printer;
	}
}
