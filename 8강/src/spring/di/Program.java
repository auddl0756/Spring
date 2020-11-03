//����ó
//������ �����ӿ�ũ ���� 5�� - Dependency�� ���� Injection�ϱ�
package spring.di;

//��Ʈ�� ����Ʈ 'O' ==> �˾Ƽ� ����Ʈ ����.
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
//		System.out.println("hello");
		
	//�̰��� �������� ����.. ��üȭ�ؼ� �������� �������� �ʿ�. ==> ������ =spring.
	//spring���� �����ϵ��� ����. ==> xml���� �ϵ���.
	/*
		Exam exam = new NewlecExam();
		//using setter.
		ExamConsole console =new GridExamConsole();		
		console.setExam(exam);
	*/
		
		
		ApplicationContext context =new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
//		ExamConsole console = (ExamConsole)context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class);
		
		console.print();
//		
	}

}
