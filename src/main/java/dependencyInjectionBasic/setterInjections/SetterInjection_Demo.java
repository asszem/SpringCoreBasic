//Source: https://www.javatpoint.com/steps-to-create-spring-application
package dependencyInjectionBasic.setterInjections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dependencyInjectionBasic.PhoneOwner;

public class SetterInjection_Demo {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/dependencyInjectionBasic/setterInjections/appCtxSetterInjection.xml");

		System.out.println("\nDependency Injection by Setter methods");

		PhoneOwner owner = (PhoneOwner) context.getBean("phoneUserBean2");
		owner.displayOwner();
	}

}
