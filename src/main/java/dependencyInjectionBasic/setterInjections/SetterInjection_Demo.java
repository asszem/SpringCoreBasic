//Source: https://www.javatpoint.com/steps-to-create-spring-application
package dependencyInjectionBasic.setterInjections;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import dependencyInjectionBasic.PhoneOwner;

public class SetterInjection_Demo {
	public static void main(String[] args) {
		// The XmlBeanFactory is the implementation class for the BeanFactory interface.
		// To use the BeanFactory, we need to create the instance of XmlBeanFactory class as given below:
		Resource resource = new ClassPathResource("appCtxSetterInjection.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		ApplicationContext context = new ClassPathXmlApplicationContext("appCtxSetterInjection.xml");

		System.out.println("\nDependency Injection by Setter methods");
		PhoneOwner user1 = (PhoneOwner) factory.getBean("phoneUserBean");
		user1.displayOwner();

		PhoneOwner user2 = (PhoneOwner) context.getBean("phoneUserBean2");
		user2.displayOwner();
	}

}
