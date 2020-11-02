//뉴렉처
//스프링 프레임워크 강의 5강 - Dependency를 직접 Injection하기
package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		
	//이것을 설정으로 빼면.. 객체화해서 전달해줄 누군가가 필요. ==> 누군가 =spring.
	//spring에게 지시하도록 변경. ==> xml에서 하도록.
	/*
		Exam exam = new NewlecExam();
		//using setter.
		ExamConsole console =new GridExamConsole();		
		console.setExam(exam);
	*/
		
		ExamConsole console = ?;
		console.print();

	}

}
