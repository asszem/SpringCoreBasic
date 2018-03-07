package springBasic;

public class PhoneUser {

	private String userName;
	private int userId;
	private String instantiatedBy;

	
	public PhoneUser() {
		instantiatedBy="Empty constructor";
		System.out.println("Phone User empty constructor called");
	}
	
	public PhoneUser(String name) {
		userName=name;
		instantiatedBy="User name constructor argument";
		System.out.println("Phone User with name constructor called");
	}

	public PhoneUser(int newId) {
		userId=newId;
		instantiatedBy="User ID constructor argument";
		System.out.println("Phone User with ID constructor called");
	}
	
	//Setter methods MUST be defined for passing value (dependency injection) from the Application Context
	public void setUserName(String newUserName) {
		this.userName = newUserName;
	}
	
	public void setUserId(int newId) {
		this.userId=newId;
	}

	public void displayUser() {
		System.out.printf("%nPhone User%n\tID:[%s]%n\tname:[%s]%n\tinstantiated by:[%s]%n",userId, userName, instantiatedBy);
	}


}
