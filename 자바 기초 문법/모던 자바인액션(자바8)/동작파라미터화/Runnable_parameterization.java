package ch2_behaviorParameterization;

public class Runnable_parameterization {
	
//	Thread t = new Thread(new Runnable() {
//		public void run() {System.out.println("hello world");};
//	}); 
//			 
//	Thread t2 = new Thread( () -> System.out.println("hello world using "));
	
	
	
	// <run multi threads>
	public static void main(String[] args) {
		Thread[]  threads = new Thread[5];
		for(int i=0;i<5;i++) {
			//lambda expression으로 스레드 호출 간단히 작성.
			threads[i]= new Thread( ()->System.out.println("hello world "));
			
			//전통적인 방식 : Thread 생성자에 Runnable 객체 전달. 
			// 			Runnable 객체 : void run()을 포함하는 Runnable 인터페이스를 구현한 (익명) 클래스
//			threads[i]= new Thread( new Runnable() {
//				@Override
//				public void run() {
//					System.out.println("hello world");
//					
//				}
//			});
			
			threads[i].start();
		}
		System.out.println("last sentence");
	}
	
}
