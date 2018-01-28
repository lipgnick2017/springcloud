package org.robin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
@EnableAutoConfiguration
public class UserClient {
	@Autowired
	private RestTemplate rsClient;
	
	@GetMapping(value="/u", produces=MediaType.APPLICATION_JSON_VALUE)
	public String getUser(@RequestParam String name){
		return rsClient.getForObject("http://USERS/user?name="+name,String.class);
	}
}
