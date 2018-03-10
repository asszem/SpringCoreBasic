package annotationBasedContainerConfiguration;

import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class) //To run with Junit5
@ContextConfiguration(classes=ConfigurationClass.class)
public class OwnerTest_Junit5 {

	@Autowired
	private Phone phoneFieldAutowired;

	@Resource(name = "thisIsATablet")
	private Tablet tabletFieldAutowired;

	@Test
	void testPhoneFieldNotNull() {
		assertNotNull(phoneFieldAutowired);
	}

	@Test
	void testTabletFieldNotNull() {
		assertNotNull(tabletFieldAutowired);
	}

}
