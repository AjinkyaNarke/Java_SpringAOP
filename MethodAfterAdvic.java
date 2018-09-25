package Service;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MethodAfterAdvic implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object o, Method m, Object[] parm, Object reObject) throws Throwable {
		
		System.out.println("Method After Advice"+reObject);
		
	}

}
