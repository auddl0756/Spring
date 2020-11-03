package 부품조립.entity;

public class NewlecExam implements Exam {
	private int kor,eng,math,com;
	
	@Override
	public int total() {
		return kor+eng+math+com;
	}
	
	@Override
	public float average() {
		return total()/4.0f;
	}

}
