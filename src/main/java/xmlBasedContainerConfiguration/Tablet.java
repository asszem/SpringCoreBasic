package xmlBasedContainerConfiguration;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Tablet {
	private static AtomicInteger count = new AtomicInteger();
	private static final Logger log = (Logger) LogManager.getLogger(Tablet.class);

	private int tabletId;
	private String vendor;
	private String type;
	private String color;
	private static Tablet instance;

	private Tablet() {
		this.tabletId = count.getAndIncrement();
		this.vendor = "defaultVendor";
		this.type = "defaultType";
		this.color = "defaultColor";
		log.info("Tablet Empty Constructor called, NEW TabletID created: " + tabletId);
	}

	private Tablet(String vendor, String type, String color) {
		this();
		this.vendor = vendor;
		this.type = type;
		this.color = color;
		log.info("Tablet Constructor with Vendor, Type and Color arguments called, for TabletID: " + tabletId);
	}

	// Static Factory methods
	public static Tablet getTablet() {
		if (instance == null) {
			instance = new Tablet();
		}
		log.info("Tablet Factory Method with no argumnets called, for TabletID: " + instance.tabletId);
		return instance;
	}

	public static Tablet getTablet(String vendor, String type, String color) {
		if (instance == null) {
			instance = new Tablet(vendor, type, color);
		}
		log.info("Static Tablet Factory Method with Argumnets Vendor, Type and Color arguments called, for TabletID: "
				+ instance.tabletId);
		return instance;
	}

	// This method returns a Phone object
	public static Phone getPhone() {
		log.info("Static Tablet Factory Method with no argumnets for creating a new Phone object called");
		return new Phone();
	}

	// A non-static factory method
	public Phone createPhone() {
		log.info("Non-Static Tablet Factory Method with no argumnets for creating a new Phone object called");
		return new Phone();
	}

	public void setVendor(String vendorToSet) {
		this.vendor = vendorToSet;
		log.info("Tablet Vendor set by Setter method for PhoneID: " + tabletId);
	}

	@Override
	public String toString() {
		return "\nTabletID:[" + tabletId + "] [" + vendor + "] [" + type + "] [" + color + "]\n";
	}

}
