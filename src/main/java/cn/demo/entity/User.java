package cn.demo.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
@ConfigurationProperties("user1")
public class User {

	//@Value("${name:hellp} ")
//	@Value("${name} ")
	private String name;
	
//	@Value("${user.age}")
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
