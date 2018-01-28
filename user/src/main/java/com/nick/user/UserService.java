package com.nick.user;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nick.user.model.User;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableAutoConfiguration
public class UserService 
{
	 @Value("${server.port}")
	private String port;
	 @GetMapping(value="/user",produces=MediaType.APPLICATION_JSON)
	public User getUser(String u){
		return User.c(port);
	}
	
    public static void main( String[] args )
    {
        SpringApplication.run(UserService.class, args);
    }
}
