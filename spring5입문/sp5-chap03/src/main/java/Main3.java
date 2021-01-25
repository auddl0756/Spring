import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.*;
import spring.ChangePaswordService;
import spring.DuplicateMemberException;
import spring.MemberInfoPrinter;
import spring.MemberListPrinter;
import spring.MemberNotFoundException;
import spring.MemberRegisterService;
import spring.RegisterRequest;
import spring.WrongIdPasswordException;

public class Main3 {
//	private static ApplicationContext ctx1=null;
//	private static ApplicationContext ctx2=null;
	private static ApplicationContext ctx=null;
	
	public static void main(String[] args) {
		//ctx=new AnnotationConfigApplicationContext(AppContext.class);
//		ctx1 = new AnnotationConfigApplicationContext(AppConfigure1.class);
//		ctx2 = new AnnotationConfigApplicationContext(AppConfigure2.class);
		
		ctx=new AnnotationConfigApplicationContext(AppConfigure1.class,AppConfigure2.class);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("input command");
			String cmd=sc.nextLine();
			
			if(cmd.equalsIgnoreCase("exit")) break;
			
			if(cmd.startsWith("new ")) {
				processNewCommand(cmd.split(" "));
			}else if(cmd.startsWith("change ")) {
				processChangeCommand(cmd.split(" "));
			}else if(cmd.startsWith("list ")) {
				processListCommand();
			}else if(cmd.startsWith("info ")) {
				processInfoCommand(cmd.split(" "));
			}
		}
	}
	
	private static void processInfoCommand(String[] args) {
		if(args.length!=2) return;
		
		MemberInfoPrinter infoPrinter = ctx.getBean(MemberInfoPrinter.class);
		infoPrinter.printMemverInfo(args[1]);
		
	}
	
	private static void processNewCommand(String[] args) {
		if(args.length!=5) return;
		
		//this is difference between simple java class. using spring container's bean
		//MemberRegisterService regSvc = ctx.getBean("memberRegSvc",MemberRegisterService.class );
		MemberRegisterService regSvc = ctx.getBean(MemberRegisterService.class );
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
			regSvc.regist(req);
			System.out.println("enrolled");
		}catch(DuplicateMemberException e) {
			System.out.println("already existing email");
		}
		
	}
	
	private static void processChangeCommand(String[] args) {
		if(args.length!=4) return;		
		
		//this is difference between simple java class. using spring container's bean
		ChangePaswordService changePasswdSvc = ctx.getBean("changePwdSvc",ChangePaswordService.class);
		
		try {
			changePasswdSvc.ChangePasword(args[1], args[2], args[3]);
		}catch(MemberNotFoundException e) {
			System.out.println("member not found");
		}catch(WrongIdPasswordException e) {
			System.out.println("password is not correct");
		}	
	}
	
	private static void processListCommand() {
		MemberListPrinter listPrinter = ctx.getBean("listPrinter",MemberListPrinter.class);
		
		listPrinter.printAll();
	}
}
