package annotationBasedContainerConfiguration.soundsystem;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.*;


import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) // To run with Junit4
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest_Junit4 {

	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	@Autowired
	@Qualifier("hardDaysNight")
	private CompactDisc cd;
	
	@Autowired
	private CDPlayer player;

	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}

	@Test
	public void play() {
		player.play();
		assertEquals("Playing A Hard Day's Night" + " by The Beatles\n", log.getLog());
	}

}