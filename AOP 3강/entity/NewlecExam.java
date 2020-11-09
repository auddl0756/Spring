package aop.entity;

import org.springframework.stereotype.Service;

//@Component
@Service		//this is same with @Component,더 특화된 것일뿐.의미를 분명하게 하기 위해.
//@Controller
public class NewlecExam implements Exam {
	
	private int kor;
	private int eng;
	private int math;
	private int com;
	
	public NewlecExam() {
		// TODO Auto-generated constructor stub
	}
	
	public NewlecExam(int kor, int eng, int math, int com) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}
	
	@Override
	public int total() {
		//곁다리 업무 호출 -> proxy로 옮김.
		//long start = System.currentTimeMillis();
		
		int result=kor+eng+math+com;
		
//		try {
//			Thread.sleep(200);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//long end =System.currentTimeMillis();
		//String message =(end-start) +" ms가 걸렸음";
		//System.out.println(message);
		
		
		return result;
	}
	
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public float average() {
		float result=total()/4.0f;
		
		return result; 
				
	}

	@Override
	public String toString() {
		return "NewlecExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}
	
}
