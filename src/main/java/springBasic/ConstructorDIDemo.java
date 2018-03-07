//Source: https://www.javatpoint.com/steps-to-create-spring-application
package springBasic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ConstructorDIDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextConstructorInjection.xml");

		System.out.println("Dependency Injection by Constructor arguments");
		PhoneUser user1 = (PhoneUser) context.getBean("phoneUserBean");
		user1.displayUser();

		PhoneUser user2 = (PhoneUser) context.getBean("phoneUserBean2");
		user2.displayUser();

		PhoneUser user3 = (PhoneUser) context.getBean("phoneUserBean3");
		user3.displayUser();

		System.out.print("\nThe setter method overwrites the constructor argument value:");
		PhoneUser user4 = (PhoneUser) context.getBean("phoneUserBean4");
		user4.displayUser();

		System.out.print("\nInstantiating object without any const-arg value in application context xml:");
		PhoneUser user5 = (PhoneUser) context.getBean("phoneUserBean5");
		user5.displayUser();
	}

}
