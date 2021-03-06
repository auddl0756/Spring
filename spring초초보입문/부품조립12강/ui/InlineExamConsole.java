package 부품조립.ui;

import org.springframework.beans.factory.annotation.Autowired;

import 부품조립.entity.Exam;

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
	@Override
	public void setExam(Exam exam) {
		this.exam=exam;
	}

}
