package chap07;

public class ExeTimeCalculator implements Calculator{
	private Calculator delegate;
	
	public ExeTimeCalculator(Calculator delegate){
		this.delegate=delegate;
	}
	//delegate : 대리자
	
	@Override
	public long factorial(long num) {
		long start = System.currentTimeMillis();
		long res=delegate.factorial(num);
		long end=System.currentTimeMillis();
		
		System.out.println("executed time: "+(end-start));
		return res;
	}
}
