package com.bv.model;

public class SavingAccount extends Account {

	private double limit_charges;
	private double min_balance;
	private boolean isSalaryAccount;
	private String holderName;

	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String getHolderName() {
		return holderName;
	}



	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}



	public double getLimit_charges() {
		return limit_charges;
	}

	public void setLimit_charges(double limit_charges) {
		this.limit_charges = limit_charges;
	}

	public double getMin_balance() {
		return min_balance;
	}

	public void setMin_balance(double min_balance) {
		this.min_balance = min_balance;
	}
	
	

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

	public SavingAccount(int acc_no, String holder_name, double balance, boolean isSalaryAccount) {
		super(acc_no, holder_name, balance);
		
		this.isSalaryAccount = isSalaryAccount;
		
	}

	

	@Override
	public String toString() {
		return super.toString()+"limit charges" +getLimit_charges() +"minimum balance"+ getMin_balance();
	}


/*
	public SavingAccount(int acc_no, String holder_name, double balance) {
		super(acc_no, holder_name, balance);
		// TODO Auto-generated constructor stub
	}
	*/
	
}
