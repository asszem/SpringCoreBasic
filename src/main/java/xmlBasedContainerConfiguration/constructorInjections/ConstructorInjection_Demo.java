//Source: https://www.javatpoint.com/steps-to-create-spring-application
package xmlBasedContainerConfiguration.constructorInjections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xmlBasedContainerConfiguration.PhoneOwner;

public class ConstructorInjection_Demo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/xmlBasedContainerConfiguration/constructorInjections/appCtxConstructorInjection.xml");

		System.out.println("\nDependency Injection by Constructor arguments");
		System.out.print("\nInstantiating object without any const-arg value in application context xml:");
		PhoneOwner user1 = (PhoneOwner) context.getBean("phoneOwnerWithoutConstructorArgumentsBean");
		user1.displayOwner();

		System.out.print("\nInstantiating object with Name constructor argument");
		PhoneOwner user2 = (PhoneOwner) context.getBean("phoneOwnerWithNameConstructorArgument");
		user2.displayOwner();

		System.out.print("\nThe setter method overwrites the constructor argument value:");
		PhoneOwner user3 = (PhoneOwner) context.getBean("phoneOwnerWithConstructorANDSetterArgument");
		user3.displayOwner();


	}

}
