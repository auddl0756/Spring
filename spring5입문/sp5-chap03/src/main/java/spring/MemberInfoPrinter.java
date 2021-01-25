package spring;

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
	
	public void setMemberDao(MemberDao memberDao) {
		this.memDao=memberDao;
	}
	
	public void setPrinter(MemberPrinter printer) {
		this.printer =printer;
	}
}
