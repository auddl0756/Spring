//뉴렉처
//스프링 프레임워크 강의 5강 - Dependency를 직접 Injection하기
package spring.di;

//컨트롤 쉬프트 'O' ==> 알아서 임포트 해줌.
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
//		System.out.println("hello");
		
	//이것을 설정으로 빼면.. 객체화해서 전달해줄 누군가가 필요. ==> 누군가 =spring.
	//spring에게 지시하도록 변경. ==> xml에서 하도록.
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
