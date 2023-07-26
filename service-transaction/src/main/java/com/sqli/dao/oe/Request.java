package com.sqli.dao.oe;

import java.util.Date;


public class Request {
	private int request_id;

    private int account_no;
    private int to_account;
    private int amount;
    private String message;
    private boolean hasViewed;
    private String status;
    private Date request_date;
	public int getRequest_id() {
		return request_id;
	}
	public void setRequest_id(int request_id) {
		this.request_id = request_id;
	}
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public int getTo_account() {
		return to_account;
	}
	public void setTo_account(int to_account) {
		this.to_account = to_account;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isHasViewed() {
		return hasViewed;
	}
	public void setHasViewed(boolean hasViewed) {
		this.hasViewed = hasViewed;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getRequest_date() {
		return request_date;
	}
	public void setRequest_date(Date request_date) {
		this.request_date = request_date;
	}
	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Request(int request_id, int account_no, int to_account, int amount, String message, boolean hasViewed,
			String status, Date request_date) {
		super();
		this.request_id = request_id;
		this.account_no = account_no;
		this.to_account = to_account;
		this.amount = amount;
		this.message = message;
		this.hasViewed = hasViewed;
		this.status = status;
		this.request_date = request_date;
	}
    
    
}
