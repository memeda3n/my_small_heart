package com.example.demo;

//@Configuration
//@EnableScheduling
public class SpringSchedule {

	//@Scheduled(cron="1 0 0 ? ? ?" )
	public void say(){
		System.out.println("this is a schedule");
	}
}
