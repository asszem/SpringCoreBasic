package annotationBasedContainerConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*@Configuration
The @Configuration annotation identifies this as a configuration class, 
and it’s expected to contain details
on beans that are to be created in the Spring application context.
*/
@Configuration

/// This class needed to enable Component scan for the package and subpackages
@ComponentScan
public class ConfigurationClass {
}

/*
 * To enable ComponentScan via XML: <?xml version="1.0" encoding="UTF-8"?> <beans xmlns="http://www.springframework.org/schema/beans" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 * xmlns:context="http://www.springframework.org/schema/context" xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
 * http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd">
 * 
 * <context:component-scan base-package="annotationBasedContainerConfiguration" />
 * 
 * </beans>
 * 
 */