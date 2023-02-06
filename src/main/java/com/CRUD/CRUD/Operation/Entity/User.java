package com.CRUD.CRUD.Operation.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CRUD_User_TBL")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private int id;
	@Column(name = "FName")
	private String name;
	@Column(name = "L_Name")
	private String lName;
	@Column(name = "Phone_No")
	private String phoneNo;
	@Column(name = "Address")
	private String add;
	@Column(name = "State")
	private String state;
	@Column(name = "Country")
	private String country;

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

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public User(int id, String name, String lName, String phoneNo, String add, String state, String country) {
		super();
		this.id = id;
		this.name = name;
		this.lName = lName;
		this.phoneNo = phoneNo;
		this.add = add;
		this.state = state;
		this.country = country;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
