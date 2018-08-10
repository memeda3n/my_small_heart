package cn.demo.confige;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.demo.entity.User;

@Configuration
public class BeanConfige {

	@Bean
	public User user(){
		return new User();
	}
}
