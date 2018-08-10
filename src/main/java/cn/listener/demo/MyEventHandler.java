package cn.listener.demo;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

//@Component
public class MyEventHandler {

//	@EventListener
	public void event(MyApplicationEvent object){
		System.out.println("MyApplicationEvent "+object.getClass());
	}
	
	
}
