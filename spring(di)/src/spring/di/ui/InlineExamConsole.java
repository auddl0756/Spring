package spring.di.ui;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {
	private Exam exam;
	
	//컨트롤 스페이스 ->  생성자 자동 선택.
	public InlineExamConsole() {
		// TODO Auto-generated constructor stub
	}
	
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}
	
	@Override
	public void setExam(Exam exam) {
		// TODO Auto-generated method stub
		this.exam=exam;
	}

	@Override
	public void print() {
		System.out.printf("total = %d , average = %f\n",exam.total(),exam.avg());
		
	}

}
