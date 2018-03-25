package javaCodeBasedContainerConfiguration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass2 {
	private static final Logger log = (Logger) LogManager.getLogger(ConfigurationClass2.class);
	
	//Creating different owner objects with the SAME phone object
	//Owner 1
	@Bean
	public OwnerLocked createOwnerLockedWithSamePhone1(PhoneLocked phoneLocked) {
		log.info("Owner1 with same phone method called, NEW Owner with EXISTING PhoneLocked will be created");
		return new OwnerLocked(phoneLocked);
	}
	//Owner 2
	@Bean
	public OwnerLocked createOwnerLockedWithSamePhone2(PhoneLocked phoneLocked) {
		log.info("Owner2 with same phone method called, NEW Owner with EXISTING PhoneLocked will be created");
		return new OwnerLocked(phoneLocked);
	}
}
