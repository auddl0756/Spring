package 何前炼赋;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import 何前炼赋.entity.Exam;
import 何前炼赋.entity.NewlecExam;
import 何前炼赋.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		Exam exam = new NewlecExam();
//		ExamConsole console =new InlineExamConsole(exam);
//		ExamConsole console =new GridExamConsole(exam);
		
//		ExamConsole console =new InlineExamConsole();
//		console.setExam(exam);
		
		ApplicationContext context
		= new ClassPathXmlApplicationContext("何前炼赋/setting.xml");
		
		ExamConsole console = (ExamConsole) context.getBean("console");
		console.print();
		
		
		
	}

}
