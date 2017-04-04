package com.capitalone.dashboard;

import org.apache.commons.logging.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application configuration and bootstrap
 * 
 */
@SpringBootApplication
//This annotation replaces 
//@Configuration- this indicates that it is a configuration class and will be processed by the spring container to generate beans  definations and service requests for those beans at runtine,
//@AutoConfiguration- enables auto-configuration of the spring context and tries to automatically based on its best guess as to what we might need
//@Componentscan - it provides component scanning directive
public class Application {

    public static void main(String[] args) {
    	
        SpringApplication.run(Application.class, args);
        
        
    }
}
