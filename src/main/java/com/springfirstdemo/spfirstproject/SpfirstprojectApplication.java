package com.springfirstdemo.spfirstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController  // = @Controller + @ResponseBody
@SpringBootApplication
public class SpfirstprojectApplication {

	public static void main(String[] args) {
		//ConfigurableApplicationContext
		SpringApplication.run(SpfirstprojectApplication.class, args);
	}

//	@GetMapping("/check")
//	public String check(){
//		return "Hello Spring";
//	}

}
