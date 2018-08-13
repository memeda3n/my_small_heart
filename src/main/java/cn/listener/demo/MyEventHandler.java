package cn.listener.demo;

//@Component
public class MyEventHandler {

//	@EventListener
	public void event(MyApplicationEvent object){
		System.out.println("MyApplicationEvent "+object.getClass());
	}
	
	
}
