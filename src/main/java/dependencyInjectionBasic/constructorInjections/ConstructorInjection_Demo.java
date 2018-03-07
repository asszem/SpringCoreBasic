//Source: https://www.javatpoint.com/steps-to-create-spring-application
package dependencyInjectionBasic.constructorInjections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dependencyInjectionBasic.PhoneOwner;

public class ConstructorInjection_Demo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("appCtxConstructorInjection.xml");

		System.out.println("Dependency Injection by Constructor arguments");
		PhoneOwner user1 = (PhoneOwner) context.getBean("phoneUserBean");
		user1.displayOwner();

		PhoneOwner user2 = (PhoneOwner) context.getBean("phoneUserBean2");
		user2.displayOwner();

		PhoneOwner user3 = (PhoneOwner) context.getBean("phoneUserBean3");
		user3.displayOwner();

		System.out.print("\nThe setter method overwrites the constructor argument value:");
		PhoneOwner user4 = (PhoneOwner) context.getBean("phoneUserBean4");
		user4.displayOwner();

		System.out.print("\nInstantiating object without any const-arg value in application context xml:");
		PhoneOwner user5 = (PhoneOwner) context.getBean("phoneUserBean5");
		user5.displayOwner();
	}

}
