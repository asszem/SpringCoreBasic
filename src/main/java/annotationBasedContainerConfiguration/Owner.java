package annotationBasedContainerConfiguration;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("thisIsTheOwnerBean")
public class Owner {
	
	//Field Autowired
	@Autowired
	private Phone phoneFieldAutowired;

	@Resource(name="thisIsATablet")
	private Tablet tabletFieldAutowired;

	//Constructor Autowired
	private Phone phoneConstructorAutowired;
	@Autowired
	public Owner(Phone phone) {
		this.phoneConstructorAutowired=phone;
	}
	
	//Setter autowired
	private Phone phoneSetterAutowired;
	@Autowired
	public void setPhone(Phone phone) {
		this.phoneSetterAutowired=phone;
	}
	
	@Override
	public String toString() {
		String phones="%nPhone%nField:%s%nSetter:%s%nConstructor:%s%n";
		String tablet="Field:%s%n";
		return String.format(phones+tablet, 
				phoneFieldAutowired, phoneSetterAutowired, phoneConstructorAutowired, tabletFieldAutowired);
	}
}
