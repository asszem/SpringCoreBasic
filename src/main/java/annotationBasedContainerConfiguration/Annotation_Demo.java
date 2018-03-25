//Source: http://websystique.com/spring/spring-dependency-injection-annotation-beans-auto-wiring-using-autowired-qualifier-resource-annotations-configuration/
package annotationBasedContainerConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Annotation_Demo {

	public static void main(String[] args) {
	
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		
		Owner owner = context.getBean("thisIsTheOwnerBean", Owner.class);
		System.out.println(owner);
		
		
	}

}
