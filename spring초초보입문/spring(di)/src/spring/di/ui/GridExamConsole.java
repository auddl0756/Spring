package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {
	private Exam exam;
	
	//��Ʈ�� �����̽� ->  ������ �ڵ� ����.
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
