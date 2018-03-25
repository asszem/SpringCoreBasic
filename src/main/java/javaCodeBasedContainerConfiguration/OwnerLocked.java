//Assume this class can not be changed, so we can not put @annotations here
package javaCodeBasedContainerConfiguration;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class OwnerLocked {
	
	private static final Logger log = (Logger) LogManager.getLogger(OwnerLocked.class);
	private static AtomicInteger count = new AtomicInteger(1); //Starting id with 1
	private int id;

	private PhoneLocked phoneLocked;

	
	public OwnerLocked() {
		this.id = count.getAndIncrement();
		log.info("OwnerLocked Empty Constructor called, NEW OwnerLocked created: " + id);
	}

	public OwnerLocked(PhoneLocked phone) {
		this(); //call the empty constructor to get the ID 
		this.phoneLocked=phone;
		log.info("OwnerLocked with PhoneLocked argument Constructor called\nfor OwnerLocked: " + id);
	}
	
	@Override
	public String toString() {
		String phones="OwnerID:[%d] PhoneLocked:%n%s%n";
		return String.format(phones, id, phoneLocked);

	}
}
