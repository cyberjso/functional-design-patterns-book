package io.functional.patterns.oo.functionalinterface;

public class Person {
	private String name;
	private Integer age;
	
	public Person(String name, int age) {
		this.name  = name;
		this.age = age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
}
