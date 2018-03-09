package annotationBasedContainerConfiguration;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.stereotype.Component;

@Component
public class Phone {
	private static AtomicInteger count = new AtomicInteger();
	private int id;
	private String vendor;
	private String type;
	private String color;

	private static final Logger log = (Logger) LogManager.getLogger(Phone.class);

	public Phone() {
		this.id = count.getAndIncrement();
		log.info("Phone Empty Constructor called, NEW PhoneID created: " + id);
	}

	@Override
	public String toString() {
		return "\nPhoneID:["+id+"] ["+vendor + "] [" + type + "] [" + color + "]\n";
	}

}
