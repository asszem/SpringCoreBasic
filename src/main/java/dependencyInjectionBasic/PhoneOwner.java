package dependencyInjectionBasic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class PhoneOwner {

	private static final Logger log = (Logger) LogManager.getLogger(PhoneOwner.class);


	private String ownerName;
	private int ownerId;
	private String instantiatedBy;
	private Phone ownerPhone;


	
	public PhoneOwner() {
		instantiatedBy="Empty constructor";
		log.info("Phone Owner empty constructor called");
	}
	
	public PhoneOwner(String name) {
		ownerName=name;
		instantiatedBy="User name constructor argument";
		log.info("Phone Owner constructor with name argument called");
	}

	public PhoneOwner(int newId) {
		ownerId=newId;
		instantiatedBy="User Id constructor argument";
		log.info("Phone Owner constructor with Id argument called");
	}
	
	public PhoneOwner(int userId, String userName, Phone phone) {
		this.ownerId=userId;
		this.ownerName=userName;
		this.ownerPhone=phone;
		this.instantiatedBy="User Id, name and phone constructor arguments";
		log.info("Phone Owner constructor with Id, name and Phone arguments called");
	}
	
	//Setter methods MUST be defined for passing value (dependency injection) from the Application Context
	public void setUserName(String newUserName) {
		this.ownerName = newUserName;
	}
	
	public void setUserId(int newId) {
		this.ownerId=newId;
	}

	public void displayOwner() {
		System.out.printf("%nDisplay Phone Owner%n\tID:[%s]%n\tname:[%s]%n\tPhone:[%s]%n\tinstantiated by:[%s]%n"
				,ownerId, ownerName, ownerPhone==null?"null":ownerPhone, instantiatedBy);
	}


}
