package xmlBasedContainerConfiguration;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.stereotype.Component;

public class Phone {
	private static AtomicInteger count = new AtomicInteger();
	private int id;
	private String vendor;
	private String type;
	private String color;

	private static final Logger log = (Logger) LogManager.getLogger(Phone.class);

	public Phone() {
		this.id = count.getAndIncrement();
		this.vendor = "defaultVendor";
		this.type = "defaultType";
		this.color = "defaultColor";
		log.info("Phone Empty Constructor called, NEW PhoneID created: " + id);
	}

	public Phone(String vendor, String type, String color) {
		this();
		this.vendor = vendor;
		this.type = type;
		this.color = color;
		log.info("Phone Constructor with vendor, type and color arguments called, for PhoneID: " + id);
	}

	public void setVendor(String vendorToSet) {
		this.vendor = vendorToSet;
		log.info("Phone Vendor set by Setter method for PhoneID: " + id);
	}

	@Override
	public String toString() {
		return "\nPhoneID:["+id+"] ["+vendor + "] [" + type + "] [" + color + "]\n";
	}

}
