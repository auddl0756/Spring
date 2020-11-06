package 부품조립.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import 부품조립.entity.Exam;

public class InlineExamConsole implements ExamConsole {
	//annotation here is also possible::기본생성자 호출 방식
	@Autowired(required=false)
	@Qualifier("exam2")
	private Exam exam;

	public InlineExamConsole() {
		System.out.println("constructor");
	}
	
	//annotation here is also possible :: 오버로드 생성자 방식
//	@Autowired
//	public InlineExamConsole(@Qualifier("exam2") Exam exam) {
	public InlineExamConsole(Exam exam) {
		System.out.println("overloaded");
		this.exam = exam;
	}
	
	@Override
	public void print() {
		if(exam==null) {
			System.out.println(0);
			System.out.println(0.0);
			return;
		}
		System.out.println(exam.total());
		System.out.println(exam.average());
	}
	

//	@Autowired
//	@Qualifier("exam2")
	@Override
	public void setExam(Exam exam) {
		System.out.println("setter");
		this.exam=exam;
	}

}