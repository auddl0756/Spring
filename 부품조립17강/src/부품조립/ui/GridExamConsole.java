package ��ǰ����.ui;

import org.springframework.beans.factory.annotation.Autowired;

import ��ǰ����.entity.Exam;

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
	
	@Autowired
	@Override
	public void setExam(Exam exam) {
		this.exam=exam;
	}
}
