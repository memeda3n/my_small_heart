package cn.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.demo.entity.User;
import cn.demo.service.UserService;

@Controller
@RestController
public class UserController {

	@Resource
	private UserService userService;
	@GetMapping("user")
	public List<User> user(){
		System.out.println(" this is user controller");
		List<User> users=userService.getUsers();
		System.out.println(users.size());
		return users;
	}
}
