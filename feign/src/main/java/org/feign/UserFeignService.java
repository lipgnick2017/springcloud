package org.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("USERS")
public interface UserFeignService {
	@GetMapping(value="/user",produces=MediaType.APPLICATION_JSON_VALUE)
	public String getUser(@RequestParam String name);
}
