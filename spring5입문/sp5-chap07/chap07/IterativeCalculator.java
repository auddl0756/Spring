package chap07;

public class IterativeCalculator implements Calculator{
	@Override
	public long factorial(long num) {
		//long startTime=System.currentTimeMillis();
		
		long res=1;
		for(int i=2;i<=num;i++) res*=i;
		
		//long endTime=System.currentTimeMillis();
		//System.out.println("실행 시간: "+(endTime-startTime));
		
		return res;
	}
}
