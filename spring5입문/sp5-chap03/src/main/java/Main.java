import java.util.Scanner;

import assembler.Assembler;
import spring.ChangePaswordService;
import spring.DuplicateMemberException;
import spring.MemberDao;
import spring.MemberNotFoundException;
import spring.MemberRegisterService;
import spring.RegisterRequest;
import spring.WrongIdPasswordException;

public class Main {
	public static void main(String[] args) {
		Assembler assembler = new Assembler();
		MemberDao member = assembler.getMemberDao();
		ChangePaswordService pw_changer= assembler.getChangePasswordService();
		
		//spring을 사용하지 않고 오직 자바만을 사용한 전통적인 심플한 객체지향 방식.
		
		//commands : new ~ -> insert new member , change~ -> change password of a member
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("input command");
			String cmd=sc.nextLine();
			
			if(cmd.equalsIgnoreCase("exit")) break;
			
			if(cmd.startsWith("new ")) {
				processNewCommand(cmd.split(" "));
			}else if(cmd.startsWith("change ")) {
				processChangeCommand(cmd.split(" "));
			}
			
		}
	}
	
	private static Assembler assembler = new Assembler();
	
	private static void processNewCommand(String[] args) {
		if(args.length!=5) return;
		
		MemberRegisterService regsvc=assembler.getMemberRegisterService();
		RegisterRequest req = new RegisterRequest();
		req.setEmail(args[1]);
		req.setName(args[2]);
		req.setPassword(args[3]);
		req.setConfirmPassword(args[4]);
		
		if(!req.isPasswordEqualtoConfirmPassword()) {
			System.out.println("password is not correct");
			return;
		}
		
		try {
			regsvc.regist(req);
			System.out.println("enrolled");
		}catch(DuplicateMemberException e) {
			System.out.println("already existing email");
		}
	}
	
	private static void processChangeCommand(String[] args) {
		if(args.length!=4) return;
		
		ChangePaswordService changePasswdSvc = assembler.getChangePasswordService();
		
		try {
			changePasswdSvc.ChangePasword(args[1], args[2], args[3]);
		}catch(MemberNotFoundException e) {
			System.out.println("member not found");
		}catch(WrongIdPasswordException e) {
			System.out.println("password is not correct");
		}
		
	}
}
