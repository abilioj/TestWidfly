package br.com.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainResources {

	@GetMapping("/")
	    public String index() {
	        return "Hello from Spring Boot";
	    }
	 
}
