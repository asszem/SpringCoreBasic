//Source: https://www.javatpoint.com/steps-to-create-spring-application
package dependencyInjectionBasic.constructorInjections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dependencyInjectionBasic.PhoneSeller;

public class MapCollectionInjection_Demo {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("appCtxMapCollectionInjection.xml");

		System.out.println("Map Collection Injection in Constructor argument");
		PhoneSeller seller = (PhoneSeller) context.getBean("sellerBean");
		seller.displaySeller();
	}

}
