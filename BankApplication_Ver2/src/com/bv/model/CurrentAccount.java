package com.bv.model;

public class CurrentAccount extends Account {
	private double creditlimit ;

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(int acc_no, String holder_name, double balance) {
		super(acc_no, holder_name, balance);
//		this.creditlimit = creditlimit;
	}

	public double getCreditlimit() {
		return creditlimit;
	}

	public void setCreditlimit(double creditlimit) {
		this.creditlimit = creditlimit;
	}
	
	
	
}
