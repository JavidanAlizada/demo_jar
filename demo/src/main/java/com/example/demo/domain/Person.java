package com.example.demo.domain;


public class Person {

	private int id;
	private FullName fullName;
	private int age;
	private Address address;
	private User user;
	private Gender gender;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public FullName getFullName() {
		return fullName;
	}
	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", fullName=" + fullName + ", age=" + age + ", address=" + address + ", user="
				+ user + ", gender=" + gender + "]";
	}
	
	
	
}
