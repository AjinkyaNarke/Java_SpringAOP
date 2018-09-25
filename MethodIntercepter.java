package Service;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class MethodIntercepter implements MethodInterceptor {

	
	@Override
	public Object invoke(MethodInvocation m1) throws Throwable {
		System.out.println("Around Advice Before Service");
		Object oc=m1.proceed();
		System.out.println("Around Advice After Service");
		return oc;// TODO Auto-generated method stub
		
	}

}
