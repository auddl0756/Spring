package 何前炼赋;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import 何前炼赋.entity.Exam;
import 何前炼赋.entity.NewlecExam;
import 何前炼赋.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		ApplicationContext context
		= new ClassPathXmlApplicationContext("何前炼赋/setting.xml");
		
		//Exam exam =context.getBean(Exam.class);
		//System.out.println(exam.toString());
		ExamConsole console = (ExamConsole) context.getBean("console");
		//ExamConsole console = context.getBean(ExamConsole.class);
		
		console.print();
		
//		List<Exam> exams =(List<Exam>) context.getBean("exams");
//		exams.add(new NewlecExam(1,1,1,1));
//		
//		for(Exam e:exams)
//			System.out.println(e);

	}

}
