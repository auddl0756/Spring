package 부품조립.ui;

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

	@Override
	public void setExam(Exam exam) {
		this.exam=exam;
	}

}
