package chap07;

public class RecursiveCalculator implements Calculator{
	
	@Override
	public long factorial(long num) {
		
		if(num==0) return 1;
		return factorial(num-1)*num;
	}
}
