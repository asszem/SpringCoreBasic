//Source: https://www.javatpoint.com/steps-to-create-spring-application
package dependencyInjectionBasic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependentObjectInjection_Demo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("appCtxObjectInjection.xml");

		System.out.println("Dependent Object Injection in Constructor argument");
		PhoneUser user1 = (PhoneUser) context.getBean("phoneUserBean");
		user1.displayUserWithPhone();
		
	}

}
