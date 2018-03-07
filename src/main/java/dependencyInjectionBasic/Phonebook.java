package dependencyInjectionBasic;

import java.util.List;

public class Phonebook {
	private int id;
	private String instantiationMethod;
	private PhoneOwner owner;
	private List<String> contacts;

	public Phonebook(int id, PhoneOwner owner, List<String> contacts) {
		this.id=id;
		this.owner=owner;
		this.contacts=contacts;
		this.instantiationMethod="Constructor with id, PhoneOwner object and contacts list args";
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
