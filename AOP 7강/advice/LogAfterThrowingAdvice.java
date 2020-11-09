package aop.advice;

import org.springframework.aop.ThrowsAdvice;

//before advice���� ���ܹ߻��� logafter throwing�� ������� �ʰ� �� Ŭ������ �����.

public class LogAfterThrowingAdvice implements ThrowsAdvice {
	public void afterThrowing(IllegalArgumentException e) throws Throwable{
		System.out.println("exception occured "+e.getMessage());
	}
}
