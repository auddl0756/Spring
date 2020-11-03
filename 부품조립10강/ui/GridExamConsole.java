package 何前炼赋.ui;

import 何前炼赋.entity.Exam;

public class GridExamConsole implements ExamConsole{
	
	private Exam exam;
	public GridExamConsole() {
	
	}
	
	public GridExamConsole(Exam exam) {
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
