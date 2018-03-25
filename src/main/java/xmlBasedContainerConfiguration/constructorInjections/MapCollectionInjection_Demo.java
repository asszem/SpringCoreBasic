//Source: https://www.javatpoint.com/steps-to-create-spring-application
package xmlBasedContainerConfiguration.constructorInjections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xmlBasedContainerConfiguration.PhoneSeller;

public class MapCollectionInjection_Demo {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/xmlBasedContainerConfiguration/constructorInjections/appCtxMapCollectionInjection.xml");

		System.out.println("Map Collection Injection in Constructor argument");
		PhoneSeller seller = (PhoneSeller) context.getBean("sellerBean");
		seller.displaySeller();
	}

}
