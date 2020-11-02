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
		Exam exam = new NewlecExam();
		
//		ExamConsole console = new InlineExamConsole(exam);
//		console.print();
		
		//dependency injection :: 조립.
		ExamConsole console = new GridExamConsole(exam);	
		console.print();

	}

}
