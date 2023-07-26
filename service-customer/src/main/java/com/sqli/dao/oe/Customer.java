package com.sqli.dao.oe;

import java.util.Date;

public class Customer {
	private int account_no;

	private String full_name;
	private String gender;
	private Date birth_date;
	private String mobile;
	private String email;
	private String status;

	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getAccount_no() {
		return account_no;
	}

	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Customer(int account_no, String full_name, String gender, Date birth_date, String mobile, String email,String status) {
		super();
		this.account_no = account_no;
		this.full_name = full_name;
		this.gender = gender;
		this.birth_date = birth_date;
		this.mobile = mobile;
		this.email = email;
		this.status=status;
		
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
}
