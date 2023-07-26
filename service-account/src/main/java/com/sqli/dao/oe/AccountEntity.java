package com.sqli.dao.oe;

public class AccountEntity {

	private int account_no;

	private String username;

	private String password;

	public int getAccount_no() {
		return account_no;
	}

	public void setAccount_no(int account_no) {
		this.account_no = account_no;
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

	public AccountEntity(int account_no, String username, String password) {
		super();
		this.account_no = account_no;
		this.username = username;
		this.password = password;
	}

}
