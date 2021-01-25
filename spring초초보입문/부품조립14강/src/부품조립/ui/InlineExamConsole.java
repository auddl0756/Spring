package ��ǰ����.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import ��ǰ����.entity.Exam;

public class InlineExamConsole implements ExamConsole {
	//annotation here is also possible::�⺻������ ȣ�� ���
	@Autowired(required=false)
	@Qualifier("exam2")
	private Exam exam;

	public InlineExamConsole() {
		System.out.println("constructor");
	}
	
	//annotation here is also possible :: �����ε� ������ ���
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