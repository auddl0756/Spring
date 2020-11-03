package ��ǰ����;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ��ǰ����.entity.Exam;
import ��ǰ����.entity.NewlecExam;
import ��ǰ����.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		Exam exam = new NewlecExam();
//		ExamConsole console =new InlineExamConsole(exam);
//		ExamConsole console =new GridExamConsole(exam);
		
//		ExamConsole console =new InlineExamConsole();
//		console.setExam(exam);
		
		ApplicationContext context
		= new ClassPathXmlApplicationContext("��ǰ����/setting.xml");
		
		ExamConsole console = (ExamConsole) context.getBean("console");
		console.print();
		
		
		
	}

}
