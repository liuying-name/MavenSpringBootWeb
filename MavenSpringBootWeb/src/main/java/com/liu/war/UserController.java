package com.liu.war;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@RequestMapping("/login")
	public String login() {
		System.out.println("ooooooooooooooo");
		System.out.println("ooooooooooooooo");
		return "hello world 。。。。";
	}

}
