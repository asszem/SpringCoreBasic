package annotationBasedContainerConfiguration;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.stereotype.Component;

@Component("thisIsATablet")
public class Tablet {
	private static AtomicInteger count = new AtomicInteger();
	private int id;
	private String vendor;
	private String type;
	private String color;

	private static final Logger log = (Logger) LogManager.getLogger(Tablet.class);

	public Tablet() {
		this.id = count.getAndIncrement();
		log.info("Tablet Empty Constructor called, NEW PhoneID created: " + id);
	}

	@Override
	public String toString() {
		return "\nTabletID:["+id+"] ["+vendor + "] [" + type + "] [" + color + "]\n";
	}

}
