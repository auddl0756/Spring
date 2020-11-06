package 何前炼赋;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import 何前炼赋.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		//< xml 规侥>
//		ApplicationContext context
//		= new ClassPathXmlApplicationContext("何前炼赋/setting.xml");

		//<annotation 规侥>
		ApplicationContext context =new AnnotationConfigApplicationContext(appConfig.class);
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();

	}

}
