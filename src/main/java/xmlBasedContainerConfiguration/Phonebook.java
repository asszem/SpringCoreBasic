package xmlBasedContainerConfiguration;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Phonebook {
	private static final Logger log = (Logger) LogManager.getLogger(Phonebook.class);
	private static AtomicInteger count=new AtomicInteger();

	private int id;
	private String instantiationMethod;
	private PhoneOwner owner;
	private List<String> contacts;

	public Phonebook(PhoneOwner owner, List<String> contacts) {
		this.id=count.getAndIncrement();
		this.owner=owner;
		this.contacts=contacts;
		this.instantiationMethod="Constructor with id, Owner object and contacts list args";
		log.info("Phonebook Constructor with vendor, type and color arguments called, NEW PhonebookID created: " + id);
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
