package annotationBasedContainerConfiguration;

import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConfigurationClass.class)
class OwnerTest {

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
