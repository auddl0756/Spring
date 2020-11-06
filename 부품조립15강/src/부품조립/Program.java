package 부품조립;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import 부품조립.entity.Exam;
import 부품조립.entity.NewlecExam;
import 부품조립.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		ApplicationContext context
		= new ClassPathXmlApplicationContext("부품조립/setting.xml");
		
		//Exam exam =context.getBean(Exam.class);
		//System.out.println(exam.toString());
		
		//"console"이라는 객체 이름으로 찾기
//		ExamConsole console = (ExamConsole) context.getBean("console");
		
		//형식으로 찾기
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
//		List<Exam> exams =(List<Exam>) context.getBean("exams");
//		exams.add(new NewlecExam(1,1,1,1));
//		
//		for(Exam e:exams)
//			System.out.println(e);

	}

}
