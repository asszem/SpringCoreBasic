package annotationBasedContainerConfiguration.soundsystem;

import org.springframework.stereotype.Component;

@Component("hardDaysNight")
public class HardDaysNight implements CompactDisc {

  private String title = "A Hard Day's Night";
  private String artist = "The Beatles";

  public void play() {
    System.out.println("Playing " + title + " by " + artist);
  }

}