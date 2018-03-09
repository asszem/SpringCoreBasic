package dependencyInjectionBasic.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dependencyInjectionBasic.PhoneOwner;

public class Autowiring_Demo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"dependencyInjectionBasic/autowiring/autowiringByName.xml");

		System.out.println("\n1. No autowiring");
		PhoneOwner owner = context.getBean("phoneOwnerNoAutowiring", PhoneOwner.class);
		owner.displayOwner();

		System.out.println("\n2. Autowiring byName");
		owner = context.getBean("phoneOwnerAutowiringByName", PhoneOwner.class);
		owner.displayOwner();

		// When autowiring by Type, only ONE bean can be defined of a given type
		// Or NoUniqueBeanDefinitionException will be thrown
		context = new ClassPathXmlApplicationContext("dependencyInjectionBasic/autowiring/autowiringByType.xml");

		System.out.println("\n3. Autowiring byType");
		owner = context.getBean("phoneOwnerAutowiringByType", PhoneOwner.class);
		owner.displayOwner();

		context = new ClassPathXmlApplicationContext("dependencyInjectionBasic/autowiring/autowiringByConstructor.xml");
		System.out.println("\n4. Autowiring by Constructor");
		owner = context.getBean("phoneOwnerAutowiringByConstructor", PhoneOwner.class);
		owner.displayOwner();
	}

}
