//Source: https://www.javatpoint.com/steps-to-create-spring-application
package dependencyInjectionBasic.constructorInjections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dependencyInjectionBasic.PhoneOwner;

public class ObjectInjection_Demo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/dependencyInjectionBasic/constructorInjections/appCtxObjectInjection.xml");

		System.out.println("Dependent Object Injection in Constructor argument");
		PhoneOwner user1 = (PhoneOwner) context.getBean("phoneOwnerBean");
		user1.displayOwner();
		
	}

}
