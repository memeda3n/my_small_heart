package cn;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

import cn.demo.entity.User;
import cn.inital.MyInitalizer;
import cn.listener.demo.MyApplicationEvent;

@SpringBootApplication
@EnableConfigurationProperties
public class MySmallHeartApplication {

	public static void main(String[] args) {
		SpringApplication application=new SpringApplication(MySmallHeartApplication.class);
		application.addInitializers(new MyInitalizer());
		ConfigurableApplicationContext context=application.run(args);
		//context.addApplicationListener(new MyApplicationListener());
		
		context.publishEvent(new MyApplicationEvent(new Object()));
		//System.out.println(context.getBean(MyApplicationListener.class));
		User user=context.getBean(User.class);
		System.out.println(user.getName()+"   "+user.getAge());
		
		context.close();
	}
}
