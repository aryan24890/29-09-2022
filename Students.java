package com.collections.bll;

public class Students {
	private String code;
	private String name;
	private int age;
	private String state;
	
	public Students() {
		
	}
	
	public Students(String code, String name, int age, String state) {
		this.code = code;
		this.name = name;
		this.age = age;
		this.state = state;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
	public String toString() {
		return "Student [Code=" + code +" Name="+ name + " \tAge="+ age + " \tState=" + state + "]";
		
	}
	
	

}