package com.example.demo.domain;

public class Address {

	private String country;
	private String city;
	private String district;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	@Override
	public String toString() {
		return "Address [country=" + country + ", city=" + city + ", district=" + district + "]";
	}
	
	
}
