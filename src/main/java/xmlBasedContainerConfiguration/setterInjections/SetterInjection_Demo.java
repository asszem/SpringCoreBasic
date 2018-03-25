//Source: https://www.javatpoint.com/steps-to-create-spring-application
package xmlBasedContainerConfiguration.setterInjections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xmlBasedContainerConfiguration.PhoneOwner;
import xmlBasedContainerConfiguration.PhoneSeller;

public class SetterInjection_Demo {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/xmlBasedContainerConfiguration/setterInjections/appCtxSetterInjection.xml");

		System.out.println("\nDependency Injection by Setter methods");

		PhoneOwner owner = (PhoneOwner) context.getBean("ownerNameBySetter");
		owner.displayOwner();

		owner = (PhoneOwner) context.getBean("multiplePhoneOwnerBySetter");
		owner.displayOwnerPhones();

		PhoneSeller seller = (PhoneSeller) context.getBean("sellerMapBySetter");
		seller.displaySeller();

	}

}
