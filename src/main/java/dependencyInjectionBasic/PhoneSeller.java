package dependencyInjectionBasic;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class PhoneSeller {

	private static final Logger log = (Logger) LogManager.getLogger(PhoneSeller.class);
	private static AtomicInteger count = new AtomicInteger();
	private int sellerId;
	private String sellerName;
	private Map<String, PhoneOwner> customers;

	public PhoneSeller() {
		this.sellerId = count.incrementAndGet();
		log.info("Phone Seller empty constructor called, NEW PhoneSellerID created: " + sellerId);
	}

	public PhoneSeller(String sellerName, Map<String, PhoneOwner> customers) {
		this();
		this.sellerName = sellerName;
		this.customers = customers;
		log.info("Phone Seller with sellerName and Map<String, Owner> constructor called, for PhoneSellerID: " + sellerId);
	}
	
	
	//Setter methods. ONE METHOD FOR ONE PROPERTY
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
		log.info("Phone Seller with sellerName SETTER called, for PhoneSellerID: " + sellerId);
	}
	public void setSellerCustomers(Map<String, PhoneOwner> customers) {
		this.customers = customers;
		log.info("Phone Seller with customers SETTER called, for PhoneSellerID: " + sellerId);
	}

	public void displaySeller() {
		System.out.println("\nSeller name: " + sellerName);
		System.out.println("Seller id: " + sellerId);
		customers.forEach((key, owner) -> {
			System.out.println("Key: " + key);
			System.out.print("Value:");
			owner.displayOwner();
		});
	}

}
