package Client;
import org.springframework.aop.framework.ProxyFactoryBean;

import Business.*;
import Service.MethodAfterAdvic;
import Service.MethodBeforeAdv;
import Service.MethodIntercepter;
import Service.Thowsm;
public class Client {

	public static void main(String[] args) {
		
		
		//Add Service to business
		
		//Create Target
	Hello t=new Hello();
	//create service
	MethodBeforeAdv s1=new MethodBeforeAdv();
	MethodAfterAdvic s2=new MethodAfterAdvic();
	MethodIntercepter s3=new MethodIntercepter();
	//Thowsm s4=new Thowsm();
	
	//Create Proxy Combin Service + target
	ProxyFactoryBean pfb=new ProxyFactoryBean();
	pfb.setTarget(t);
	pfb.addAdvice(s1);
	pfb.addAdvice(s2);
	pfb.addAdvice(s3);
//	pfb.addAdvice(s4);
	
	Hello ht=(Hello)pfb.getObject();
	ht.Hello();

	
	}

}
