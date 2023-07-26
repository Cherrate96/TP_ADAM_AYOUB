package com.sqli.dao.oe;

import java.util.Date;

public class Feedback {
	private int feedback_id;

	private int account_no;
	private String feedback;
	private Integer hearts;
	private Date time;

	public int getFeedback_id() {
		return feedback_id;
	}

	public void setFeedback_id(int feedback_id) {
		this.feedback_id = feedback_id;
	}

	public int getAccount_no() {
		return account_no;
	}

	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Integer getHearts() {
		return hearts;
	}

	public void setHearts(Integer hearts) {
		this.hearts = hearts;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Feedback(int feedback_id, int account_no, String feedback, Integer hearts, Date time) {
		super();
		this.feedback_id = feedback_id;
		this.account_no = account_no;
		this.feedback = feedback;
		this.hearts = hearts;
		this.time = time;
	}
}
