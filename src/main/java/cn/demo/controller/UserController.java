package cn.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class UserController {

	@GetMapping("user")
	public String user(){
		System.out.println(" this is user controller");
		return " this is user controller";
	}
}
