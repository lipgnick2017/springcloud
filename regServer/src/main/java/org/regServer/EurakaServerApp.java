package org.regServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class EurakaServerApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(EurakaServerApp.class, args);
    }
}
