package cn.listener.demo;

import org.springframework.context.ApplicationEvent;

import cn.demo.controller.UserController;
import cn.demo.entity.User;

public class MyApplicationEvent extends ApplicationEvent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyApplicationEvent(Object source) {
		super(source);
	}

	public void ofUser(UserController user){
		if (user!=null) {
			System.out.println(user);
		}else {
			System.out.println("user is null");
		}
	}
	
	
}
