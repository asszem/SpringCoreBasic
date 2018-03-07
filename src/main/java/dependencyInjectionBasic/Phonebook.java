package dependencyInjectionBasic;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Phonebook {
	private int id;
	private String instantiationMethod;
	private PhoneOwner owner;
	private List<String> contacts;
	private static final Logger log = (Logger) LogManager.getLogger(Phonebook.class);

	public Phonebook(int id, PhoneOwner owner, List<String> contacts) {
		this.id=id;
		this.owner=owner;
		this.contacts=contacts;
		this.instantiationMethod="Constructor with id, PhoneOwner object and contacts list args";
		log.info("Phonebook Constructor with vendor, type and color arguments called");
	}

	public void displayContacts() {
		contacts.forEach(System.out::println);
	}
	
	public void displayInstantiationMethod() {
		System.out.println("Instantiation method: " + instantiationMethod);
	}
	
	public void displayOwner() {
		owner.displayOwner();
	}
}
