//Sources:
//https://docs.spring.io/spring-javaconfig/docs/1.0.0.m3/reference/html/creating-bean-definitions.html
//https://docs.spring.io/spring-javaconfig/docs/1.0.0.m3/reference/html/creating-bean-definitions.html
package javaCodeBasedContainerConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaCodeBasedContext_Demo {

	public static void main(String[] args) {
		// Create an Application Context with multiple configuration files
		// Note: JavaConfigApplicationContext does not exists anymore
		// https://stackoverflow.com/questions/7295642/spring-javaconfig-nosuchbeandefinitionexception-no-unique-bean-of-type/7295738#7295738
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		// Adding another Configuration class to application context
		context.register(ConfigurationClass1.class);
		context.register(ConfigurationClass2.class);
		context.refresh();

		// Get a phone object

		// Configuration class has only one PhoneLocked method,
		// so the getBean method can be provided with the type 'PhoneLocked'
		PhoneLocked phone = context.getBean(PhoneLocked.class);
		System.out.println("\nSingleton Phone0 object instantiated");
		System.out.println(phone.toString());

		// Get different Owner objects with different Phone instances

		// Configuration class has multiple OwnerLocked beans
		// so the getBean method must specify exactly by the name which one to use

		// Owner1 Phone1
		OwnerLocked owner1 = (OwnerLocked) context.getBean("createOwnerLocked");
		System.out.println("Owner1 with new Phone1");
		System.out.println(owner1.toString());

		// Owner2 Phone0
		OwnerLocked owner2 = (OwnerLocked) context.getBean("createAnotherOwnerLocked");
		System.out.println("Owner2 with Phone0");
		System.out.println(owner2.toString());

		// Get different owners with same phone instances
		// The already created 'phone' object will be provided as a parameter

		// Owner3 Phone0
		OwnerLocked owner3 = (OwnerLocked) context.getBean("createOwnerLockedWithSamePhone1");
		System.out.println("Owner3 with Phone0 object");
		System.out.println(owner3.toString());

		// Owner3 Phone0
		OwnerLocked owner4 = (OwnerLocked) context.getBean("createOwnerLockedWithSamePhone2");
		System.out.println("Owner3 with Phone0 object");
		System.out.println(owner4.toString());

	}

}
