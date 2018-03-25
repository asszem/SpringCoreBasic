package xmlBasedContainerConfiguration.factoryMethodInjections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xmlBasedContainerConfiguration.Phone;
import xmlBasedContainerConfiguration.Tablet;

public class FactoryMethodInjections_Demo {

	public static void main(String[] args) {
		Tablet tablet = Tablet.getTablet("Vendor", "Type", "Color");
		System.out.println("Tablet created by Factory method: " + tablet);

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/xmlBasedContainerConfiguration/factoryMethodInjections/factoryMethodInjection.xml");

		tablet=context.getBean("tabletWithoutArguments", Tablet.class);
		System.out.println("Tablet injected by Static Factory method: " + tablet);
		
		Phone phone = context.getBean("tabletFactoryGetPhone", Phone.class);
		System.out.println("Phone created by Static Factory method injected to bean tabletFactoryGetPhone");
		System.out.println(phone);

		phone = context.getBean("tabletNonStaticFactoryGetPhone", Phone.class);
		System.out.println("Phone created by Non-StaticFactory method injected by referenced Tablet bean");
		System.out.println(phone);
	}

}
