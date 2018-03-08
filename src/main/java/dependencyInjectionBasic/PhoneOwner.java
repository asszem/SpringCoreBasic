package dependencyInjectionBasic;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class PhoneOwner {

	private static final Logger log = (Logger) LogManager.getLogger(PhoneOwner.class);
	private static AtomicInteger count=new AtomicInteger();

	private String ownerName;
	private int ownerId;
	private String instantiatedBy;
	private Phone ownerPhone;
	private List<Phone> ownerPhones;

	public PhoneOwner() {
		this.ownerId=count.getAndIncrement();
		instantiatedBy = "Empty constructor";
		log.info("Phone Owner empty constructor called, NEW OwnerID created: " + ownerId);
	}

	public PhoneOwner(String ownerNameArgument) {
		this();
		ownerName = ownerNameArgument;
		instantiatedBy = "User name constructor argument";
		log.info("Phone Owner constructor with name argument called for OwnerID: " + ownerId);
	}

	public PhoneOwner(String ownerNameArgument, Phone phone) {
		this();
		this.ownerName = ownerNameArgument;
		this.ownerPhone = phone;
		this.instantiatedBy = "Owner Name and Phone constructor arguments";
		log.info("Phone Owner constructor with Name and Phone arguments called for OwnerID: "+ownerId);
	}

	public PhoneOwner(String ownerNameArgument, List<Phone> phones) {
		this();
		this.ownerName = ownerNameArgument;
		this.ownerPhones = phones;
		this.instantiatedBy = "Owner Name and PhoneS constructor arguments";
		log.info("Phone Owner constructor with Name and List<Phone> arguments called for OwnerID: " + ownerId);

	}

	// Setter methods MUST be defined for passing value (dependency injection) from the Application Context
	public void setOwnerName(String newOwnerName) {
		this.ownerName = newOwnerName;
	}

	public void displayOwner() {
		System.out.printf("%nDisplay Phone Owner%n\tID:[%s]%n\tname:[%s]%n\tPhone:[%s]%n\tinstantiated by:[%s]%n",
				ownerId, ownerName, ownerPhone == null ? "null" : ownerPhone, instantiatedBy);
	}

	public void displayOwnerPhones() {
		System.out.printf("%nDisplay Phones for Owner%n\tID:[%s]%n\tname:[%s]" + "%n\tinstantiated by:[%s]%n", ownerId,
				ownerName, instantiatedBy);
		ownerPhones.forEach((phone)->{System.out.println("\t"+phone);});
	}

}
