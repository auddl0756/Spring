package 何前炼赋.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import 何前炼赋.entity.Exam;

public class InlineExamConsole implements ExamConsole {
	
	private Exam exam;

	public InlineExamConsole() {

	}
	
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.println(exam.total());
		System.out.println(exam.average());
	}
	

	@Autowired
	@Qualifier("exam2")
	@Override
	public void setExam(Exam exam) {
		this.exam=exam;
	}

}
