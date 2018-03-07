package dependencyInjectionBasic;

public class PhoneUser {

	private String userName;
	private int userId;
	private String instantiatedBy;
	private Phone userPhone;

	
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
		instantiatedBy="User Id constructor argument";
		System.out.println("Phone User with ID constructor called");
	}
	
	public PhoneUser(int userId, String userName, Phone phone) {
		this.userId=userId;
		this.userName=userName;
		this.userPhone=phone;
		this.instantiatedBy="User Id, name and phone constructor arguments";
		System.out.println("Phone User with ID, userName and Phone constructor called");
	}
	
	//Setter methods MUST be defined for passing value (dependency injection) from the Application Context
	public void setUserName(String newUserName) {
		this.userName = newUserName;
	}
	
	public void setUserId(int newId) {
		this.userId=newId;
	}

	public void displayUser() {
		System.out.printf("%nPhone User%n\tID:[%s]%n\tname:[%s]%n\tinstantiated by:[%s]%n"
				,userId, userName, instantiatedBy);
	}

	public void displayUserWithPhone() {
		System.out.printf("%nPhone User%n\tID:[%s]%n\tname:[%s]%n\tPhone:[%s]%n\tinstantiated by:[%s]%n"
				,userId, userName, userPhone.toString(), instantiatedBy);
	}


}
