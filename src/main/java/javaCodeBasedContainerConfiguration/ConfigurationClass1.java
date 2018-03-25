package javaCodeBasedContainerConfiguration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*@Configuration
The @Configuration annotation identifies this as a configuration class, 
and it’s expected to contain details
on beans that are to be created in the Spring application context.
*/

@Configuration
// @ComponentScan - this is removed as ComponentScan will not be used in this scenario
public class ConfigurationClass1 {

	private static final Logger log = (Logger) LogManager.getLogger(ConfigurationClass1.class);

	/*
	 * The @Bean annotation tells Spring that this method will return an object that should be registered * as a bean in the Spring application context. The body of the method contains logic that
	 * ultimately results in the creation of the bean instance.
	 */
	@Bean
	public PhoneLocked createNewPhoneLocked() {
		log.info("createNewPhoneLocked method called, a NEW PhoneLocked object will be returned");
		PhoneLocked newPhone = new PhoneLocked();
		newPhone.setVendor("@Bean");
		return newPhone;
	}

	public PhoneLocked createNewPhoneLockedNotBean() {
		log.info("createNewPhoneLockedNotBean method called, a NEW PhoneLocked object will be returned");
		PhoneLocked newPhone = new PhoneLocked();
		newPhone.setVendor("NotBean");
		return newPhone;
	}

	// Create new OwnerLocked Bean
	// This will use createNewPhoneLockedNotBean() method in OwnerLocked constructor argument
	// This will create a NEW PhoneLocked instance
	@Bean
	public OwnerLocked createOwnerLocked() { // The method name will be the bean ID
		log.info("createOwnerLocked method called, a NEW OwnerLocked object will be returned, with a new PhoneLocked");
		return new OwnerLocked(createNewPhoneLockedNotBean());
	}

	// Create another OwnerLocked Bean
	// This will use createNewPhoneLocked() method in OwnerLocked constructor argument
	// This will use the already created singleton PhoneLocked bean instance
	@Bean
	public OwnerLocked createAnotherOwnerLocked() {
		log.info(
				"createAnotherOwnerLocked method called, a NEW OwnerLocked object will be returned, with a new PhoneLocked");
		return new OwnerLocked(createNewPhoneLocked());
	}

	// Creating different owner objects with the SAME phone object
	// See sample from ConfigurationClass2.java
}
