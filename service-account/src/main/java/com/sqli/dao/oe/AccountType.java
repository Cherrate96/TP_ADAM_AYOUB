package com.sqli.dao.oe;

public class AccountType {
	private int account_no;

	private String account_type;

	public int getAccount_no() {
		return account_no;
	}

	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public AccountType(int account_no, String account_type) {
		super();
		this.account_no = account_no;
		this.account_type = account_type;
	}

	public AccountType() {
		super();
		// TODO Auto-generated constructor stub
	}

}
