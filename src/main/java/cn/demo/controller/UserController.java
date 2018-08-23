package cn.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
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
	@Resource
	private RedisTemplate<String, Object> redisTemplate;
	@Resource(name = "redisTemplate")
	private ValueOperations<Object, Object> valOpsObj;
	@GetMapping("user")
	public List<User> user(){
		String key="1_user4";
		redisTemplate.opsForValue().set(key, "张三4");
		System.out.println(" this is user controller");
		List<User> users=userService.getUsers();
		System.out.println(users.size());
		System.out.println(valOpsObj.get(key));
		return users;
	}
	
	
	
	
	
}
