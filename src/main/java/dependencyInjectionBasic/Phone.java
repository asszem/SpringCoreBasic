package dependencyInjectionBasic;

public class Phone {
	private String vendor;
	private String type;
	private String color;

	public Phone(String vendor, String type, String color) {
		super();
		this.vendor = vendor;
		this.type = type;
		this.color = color;
	}

	@Override
	public String toString() {
		return vendor + " " + type + " " + color;
	}

}
