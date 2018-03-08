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

	public PhoneSeller(String sellerName, Map<String, PhoneOwner> customers) {
		this.sellerId = count.incrementAndGet();
		this.sellerName = sellerName;
		this.customers = customers;
		log.info("Phone Seller with sellerName and Map<String, PhoneOwner> constructor called, NEW PhoneSellerID created: " + sellerId);
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
