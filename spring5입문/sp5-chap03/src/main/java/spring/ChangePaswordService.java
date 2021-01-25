package spring;

public class ChangePaswordService {
	private MemberDao memberDao; 
	
	public void ChangePasword(String email,String oldpassword,String newpassword) {
		Member member =memberDao.selectByEmail(email);
		if(member==null) throw new MemberNotFoundException();
		
		
		member.changePassword(oldpassword, newpassword);
		memberDao.update(member);
	}

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao=memberDao;
		
	}
}
