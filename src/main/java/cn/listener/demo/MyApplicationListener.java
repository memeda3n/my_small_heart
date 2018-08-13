package cn.listener.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import cn.demo.controller.UserController;
@Component
@Configuration
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {

	@Autowired
	UserController user;
	
	@Override
	public void onApplicationEvent(MyApplicationEvent event) {
		System.out.println("这是一个监听："+event.getClass().getName());
		event.ofUser(user);
	}

	@Bean
	public Runnable runnable(){
		return ()->{};
	}
	
}
