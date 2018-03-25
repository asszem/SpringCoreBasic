//Assume this class can not be changed, so we can not put @annotations here
package javaCodeBasedContainerConfiguration;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

//No @Component annotation, so it will not be used for Component scan
public class PhoneLocked {

	private static AtomicInteger count = new AtomicInteger();
	private int id;
	private String vendor;
	private String type;
	private String color;

	private static final Logger log = (Logger) LogManager.getLogger(PhoneLocked.class);

	public PhoneLocked() {
		id = count.getAndIncrement();
		log.info("PhoneLocked Empty Constructor called, NEW PhoneID created: " + id);
	}

	@Override
	public String toString() {
		return "PhoneID:[" + id + "] V:[" + getVendor() + "] T:[" + type + "] C:[" + color + "]\n";
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

}
