package ��ǰ����;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ��ǰ����.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		//< xml ���>
//		ApplicationContext context
//		= new ClassPathXmlApplicationContext("��ǰ����/setting.xml");

		//<annotation ���>
		ApplicationContext context =new AnnotationConfigApplicationContext(appConfig.class);
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();

	}

}
