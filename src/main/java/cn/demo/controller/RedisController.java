package cn.demo.controller;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

	@Resource
	private RedisTemplate<String, Object> redisTemplate;
	
	@RequestMapping("getmsg")
	public Object getMsg(){
		
		Object a=redisTemplate.opsForValue().get("1_user4");
		
		redisTemplate.opsForValue().set("demo:redis:user:", "王力宏");
		return redisTemplate.opsForValue().get("demo:redis:user:");
	}
}
