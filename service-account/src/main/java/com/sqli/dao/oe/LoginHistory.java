package com.sqli.dao.oe;

import java.util.Date;

public class LoginHistory {
	private int token_id;
	private Date login_time;
	private Date logout_time;
	private int account_no;

	public int getToken_id() {
		return token_id;
	}

	public void setToken_id(int token_id) {
		this.token_id = token_id;
	}

	public int getAccount_no() {
		return account_no;
	}

	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}

	public Date getLogin_time() {
		return login_time;
	}

	public void setLogin_time(Date login_time) {
		this.login_time = login_time;
	}

	public Date getLogout_time() {
		return logout_time;
	}

	public void setLogout_time(Date logout_time) {
		this.logout_time = logout_time;
	}

	public LoginHistory(int token_id, Date login_time, Date logout_time, int account_no) {
		super();
		this.token_id = token_id;
		this.login_time = login_time;
		this.logout_time = logout_time;
		this.account_no = account_no;
	}

	public LoginHistory() {
		super();
		// TODO Auto-generated constructor stub
	}

}
