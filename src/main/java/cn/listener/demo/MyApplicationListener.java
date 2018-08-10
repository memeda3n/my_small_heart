package cn.listener.demo;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
//@Component
//@Configuration
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {


	@Override
	public void onApplicationEvent(MyApplicationEvent event) {
		System.out.println("这是一个监听："+event.getClass().getName());
		
	}

	@Bean
	public Runnable runnable(){
		return ()->{};
	}
	
}
