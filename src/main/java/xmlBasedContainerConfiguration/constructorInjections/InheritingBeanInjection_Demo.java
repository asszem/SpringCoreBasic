//Source: https://www.javatpoint.com/steps-to-create-spring-application
package xmlBasedContainerConfiguration.constructorInjections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xmlBasedContainerConfiguration.PhoneSeller;

public class InheritingBeanInjection_Demo {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/xmlBasedContainerConfiguration/constructorInjections/appCtxInheritingBean.xml");

		System.out.println("Inheriting Bean in Constructor argument");
		PhoneSeller seller = (PhoneSeller) context.getBean("originalSellerBean");
		seller.displaySeller();

		seller = (PhoneSeller) context.getBean("inheritedSellerBean");
		seller.displaySeller();
	}

}
