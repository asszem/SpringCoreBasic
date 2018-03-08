package dependencyInjectionBasic;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Phone {
	private static AtomicInteger count=new AtomicInteger();
	private int id; 
	private String vendor;
	private String type;
	private String color;

	private static final Logger log = (Logger) LogManager.getLogger(Phone.class);

	public Phone(String vendor, String type, String color) {
		super();
		this.id=count.getAndIncrement();
		this.vendor = vendor;
		this.type = type;
		this.color = color;
		log.info("Phone Constructor with vendor, type and color arguments called, NEW PhoneID created: "+id);
	}

	@Override
	public String toString() {
		return vendor + " " + type + " " + color+ " <id: "+id+">";
	}

}
