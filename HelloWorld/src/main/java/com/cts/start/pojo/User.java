package com.cts.start.pojo;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

@Entity

@Table(name = "users")

public class User {

	@Id

	private String username;
	@Column(name = "password", nullable = false, length = 100)

	private String password;
	
	private String confirmed;

	private String usertype;

	private String firstname;

	private String lastname;

	private String email;


	private int phone;

	private String gender;
	
	private String address;
	

	public String getConfirmed() {

		return confirmed;

	}

	public void setConfirmed(String confirmed) {

		this.confirmed = confirmed;

	}

	

	public Integer getAge() {

		return age;

	}

	public void setAge(Integer age) {

		this.age = age;

	}

	private Integer age;

	public String getGender() {

		return gender;

	}

	public void setGender(String gender) {

		this.gender = gender;

	}

	public String getUsername() {

		return username;

	}

	public void setUsername(String username) {

		this.username = username;

	}

	public String getPassword() {

		return password;

	}

	public void setPassword(String password) {

		this.password = password;

	}

	public String getFirstname() {

		return firstname;

	}

	public void setFirstname(String firstname) {

		this.firstname = firstname;

	}

	public String getLastname() {

		return lastname;

	}

	public void setLastname(String lastname) {

		this.lastname = lastname;

	}

	public String getEmail() {

		return email;

	}

	public void setEmail(String email) {

		this.email = email;

	}

	public String getAddress() {

		return address;

	}

	public void setAddress(String address) {

		this.address = address;

	}

	public Integer getPhone() {

		return phone;

	}

	public void setPhone(Integer phone) {

		this.phone = phone;

	}

	public String getUsertype() {

		return usertype;

	}

	public void setUsertype(String usertype) {

		this.usertype = usertype;

	}

	


}
