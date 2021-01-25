package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {
	private Exam exam;
	
	//컨트롤 스페이스 ->  생성자 자동 선택.
	public GridExamConsole() {
		// TODO Auto-generated constructor stub
	}
	
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}
	
	@Override
	public void print() {
		System.out.println(exam.total());
		System.out.println(exam.avg());
		
	}

	@Override
	public void setExam(Exam exam) {
		// TODO Auto-generated method stub
		this.exam=exam;
	}

}
