package Service;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MethodBeforeAdv implements MethodBeforeAdvice {

	@Override
	public void before(Method m, Object[] o, Object param) throws Throwable {
		
		
		System.out.println("In method Before Advice");
		
	}

}
