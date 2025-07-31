package com.atishay.springboot.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Profile("dev")
//for building rest api
@RestController
public class DevController {
	
	
	
	//for get mapping
	@GetMapping("/courses1")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
		new Course(1, "Learn AWS in dev", "in28Minutes"),
		// we are creating an object
		//List is the return type here 
		new Course(2, "Learn DevOps", "in28Minutes"));
	}
	
	@GetMapping("/courses2")
	public List<Course> retrieveAllCourses2(){
		return Arrays.asList(
		new Course(1, "Learn AWS in dev", "in28Minutes"),
		// we are creating an object
		//List is the return type here 
		new Course(2, "Learn DevOps", "in28Minutes"));
	}

}
