package com.example.demo.domain;

public class FullName {

	private String name;
	private String surname;
	private String fatherName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	@Override
	public String toString() {
		return "FullName [name=" + name + ", surname=" + surname + ", fatherName=" + fatherName + "]";
	}

}
