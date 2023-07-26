package com.sqli.dao.oe;

import java.util.Date;

public class Transaction {
	private int trans_id;

    private Date trans_date;
    private int amount;
    private String trans_type;
    private String purpose;
    private int to_account;
    private int account_no;
	private int account_bal;

    public int getTrans_id() {
		return trans_id;
	}
	public void setTrans_id(int trans_id) {
		this.trans_id = trans_id;
	}
	public Date getTrans_date() {
		return trans_date;
	}
	public void setTrans_date(Date trans_date) {
		this.trans_date = trans_date;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getTrans_type() {
		return trans_type;
	}
	public void setTrans_type(String trans_type) {
		this.trans_type = trans_type;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public int getTo_account() {
		return to_account;
	}
	public void setTo_account(int to_account) {
		this.to_account = to_account;
	}
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public int getAccount_bal() {
		return account_bal;
	}
	public void setAccount_bal(int account_bal) {
		this.account_bal = account_bal;
	}
	public Transaction(int trans_id, Date trans_date, int amount, String trans_type, String purpose, int to_account,
			int account_no, int account_bal) {
		super();
		this.trans_id = trans_id;
		this.trans_date = trans_date;
		this.amount = amount;
		this.trans_type = trans_type;
		this.purpose = purpose;
		this.to_account = to_account;
		this.account_no = account_no;
		this.account_bal = account_bal;
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
}
