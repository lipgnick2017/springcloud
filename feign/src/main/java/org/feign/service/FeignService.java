package org.feign.service;

import org.feign.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignService {

	@Autowired
	UserFeignService  us;
	
	@GetMapping(value="/myservice",produces=MediaType.APPLICATION_JSON_VALUE)
	public String myService(){
		return us.getUser("test");
		
	}
}
