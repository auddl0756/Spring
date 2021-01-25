package 부품조립;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import 부품조립.entity.Exam;
import 부품조립.entity.NewlecExam;
import 부품조립.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		//Exam exam = new NewlecExam();
//		ExamConsole console =new InlineExamConsole(exam);
//		ExamConsole console =new GridExamConsole(exam);
		
//		ExamConsole console =new InlineExamConsole();
//		console.setExam(exam);
		
		ApplicationContext context
		= new ClassPathXmlApplicationContext("부품조립/setting.xml");
		
		Exam exam =context.getBean(Exam.class);
		System.out.println(exam.toString());
		ExamConsole console = (ExamConsole) context.getBean("console");
		//ExamConsole console = context.getBean(ExamConsole.class);
		
		console.print();
		
		
		//<collection> 자바 코드
//		List<Exam> exams =new ArrayList<>();
//		exams.add(new NewlecExam(1,1,1,1));
//		
//		for(Exam e:exams)
//			System.out.println(e);		
		
		
		List<Exam> exams =(List<Exam>) context.getBean("exams");
		exams.add(new NewlecExam(1,1,1,1));
		
		for(Exam e:exams)
			System.out.println(e);
		
		
		
	}

}
