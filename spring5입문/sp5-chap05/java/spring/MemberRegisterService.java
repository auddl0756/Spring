package spring;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberRegisterService {
	@Autowired
	private MemberDao memberDao;
	
	public MemberRegisterService() {
		
	}
	
	//setter를 안 쓰고 생성자를 이용한 di방식
	public MemberRegisterService(MemberDao memberDao) {
		this.memberDao=memberDao;
	}
	
	public Long regist(RegisterRequest req) {
		Member ret=memberDao.selectByEmail(req.getEmail());
		if(ret!=null) throw new DuplicateMemberException("duplicated email:"+req.getEmail());		
		
		Member newMember = new Member(req.getEmail(),req.getPassword(),req.getName()
				,LocalDateTime.now());
		
		memberDao.insert(newMember);
		return newMember.getId();
	}
}
