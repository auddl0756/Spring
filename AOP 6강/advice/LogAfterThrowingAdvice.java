package aop.advice;

import org.springframework.aop.ThrowsAdvice;

//before advice에서 예외발생시 logafter throwing이 실행되지 않고 이 클래스가 실행됨.

public class LogAfterThrowingAdvice implements ThrowsAdvice {
	public void afterThrowing(IllegalArgumentException e) throws Throwable{
		System.out.println("exception occured "+e.getMessage());
	}
}
