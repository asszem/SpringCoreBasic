//Source: https://www.javatpoint.com/steps-to-create-spring-application
package dependencyInjectionBasic.constructorInjections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dependencyInjectionBasic.PhoneOwner;
import dependencyInjectionBasic.Phonebook;

public class ListCollectionInjection_Demo {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/dependencyInjectionBasic/constructorInjections/appCtxListCollectionInjection.xml");

		System.out.println("List Collection Injection in Constructor argument");
		PhoneOwner user1=(PhoneOwner) context.getBean("multiplePhoneOwnerBean");
		user1.displayOwner();
		user1.displayOwnerPhones();

		System.out.println("Contacts:");
		Phonebook phonebook = (Phonebook) context.getBean("phoneBookBean");
		phonebook.displayContacts();
		phonebook.displayInstantiationMethod();
		phonebook.displayOwner();
		
	}

}
