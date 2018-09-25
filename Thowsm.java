package Service;

import org.springframework.aop.ThrowsAdvice;

public class Thowsm implements ThrowsAdvice {

	public void Afterthrowing(Exception e)throws Throwable
	{
		
			System.out.println("For Exception");
	}
}
