//����ó
//������ �����ӿ�ũ ���� 5�� - Dependency�� ���� Injection�ϱ�
package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		
	//�̰��� �������� ����.. ��üȭ�ؼ� �������� �������� �ʿ�. ==> ������ =spring.
	//spring���� �����ϵ��� ����. ==> xml���� �ϵ���.
	/*
		Exam exam = new NewlecExam();
		//using setter.
		ExamConsole console =new GridExamConsole();		
		console.setExam(exam);
	*/
		
		ExamConsole console = ?;
		console.print();

	}

}
