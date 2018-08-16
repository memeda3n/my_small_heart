package cn.demo.entity;

//@ConfigurationProperties("user1")
public class User {

	//@Value("${name:hellp} ")
//	@Value("${name} ")
	private String name;
	
//	@Value("${user.age}")
	private Integer age;

	private Long id;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
