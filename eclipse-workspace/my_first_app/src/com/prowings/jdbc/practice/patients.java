package com.prowings.jdbc.practice;

import java.sql.Date;

public class patients {
	private int id;
	private String name;
	private String address;
	private String gender;
	private Date date_of_birth;

	public patients() {
		super();
		// TODO Auto-generated constructor stub
	}

	public patients(int id, String name, String address, String gender, Date date_of_birth) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.date_of_birth = date_of_birth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	@Override
	public String toString() {
		return "patients [id=" + id + ", name=" + name + ", address=" + address + ", gender=" + gender
				+ ", date_of_birth=" + date_of_birth + "]";
	}

}
