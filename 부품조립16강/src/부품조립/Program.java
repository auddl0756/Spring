package ��ǰ����;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ��ǰ����.entity.Exam;
import ��ǰ����.entity.NewlecExam;
import ��ǰ����.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		ApplicationContext context
		= new ClassPathXmlApplicationContext("��ǰ����/setting.xml");
		
		//Exam exam =context.getBean(Exam.class);
		//System.out.println(exam.toString());
		
		//"console"�̶�� ��ü �̸����� ã��
//		ExamConsole console = (ExamConsole) context.getBean("console");
		
		//�������� ã��
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
//		List<Exam> exams =(List<Exam>) context.getBean("exams");
//		exams.add(new NewlecExam(1,1,1,1));
//		
//		for(Exam e:exams)
//			System.out.println(e);

	}

}
