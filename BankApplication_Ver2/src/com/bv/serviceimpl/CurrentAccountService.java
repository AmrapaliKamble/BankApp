package com.bv.serviceimpl;

import java.util.Scanner;

import com.bv.model.CurrentAccount;
import com.bv.service.ITransaction;
import com.universal.exp.InsufficientBalance;

public class CurrentAccountService implements ITransaction{

	CurrentAccount currentAccount;
	
	public CurrentAccountService(CurrentAccount currentAccount) {
		super();
		this.currentAccount = currentAccount;
		currentAccount.setCreditlimit(50000);
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("Before withdraw:" + currentAccount.getBalance());
		if (amount < 0) {
			System.out.println("\n" + "------------------------SMS-------------------------------");
			try {
				throw new InsufficientBalance("Invalid Transaction amount cannot be negative");
			} catch (InsufficientBalance e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(amount > currentAccount.getBalance() && currentAccount.getBalance() != 0) {
			//currentAccount.setBalance(currentAccount.getBalance()-amount);
		double rem = amount - currentAccount.getBalance();
		currentAccount.setBalance(currentAccount.getBalance()-(amount - rem));
		currentAccount.setCreditlimit(currentAccount.getCreditlimit()-rem);
		System.out.println("balnce in main balance" + currentAccount.getBalance());
		System.out.println("balnce in creditlimit balance" + currentAccount.getCreditlimit());

		}
		else {
			currentAccount.setBalance(currentAccount.getCreditlimit()-amount);
			System.out.println("balnce in main balance" + currentAccount.getBalance());
			System.out.println("balnce in creditlimit balance" + currentAccount.getCreditlimit());
		}
	}

	@Override
	public void deposite(double amount) {
		if(currentAccount.getCreditlimit() == 50000) {
			currentAccount.setCreditlimit(currentAccount.getBalance() + amount);
		}
		else if(currentAccount.getCreditlimit() < 50000) {
			currentAccount.setBalance(currentAccount.getCreditlimit()+ amount);
			if(currentAccount.getCreditlimit() > 50000) {
				double extra = currentAccount.getCreditlimit() -50000;
				currentAccount.setCreditlimit(currentAccount.getCreditlimit() - extra);
				currentAccount.setBalance(currentAccount.getBalance() + extra);
			}
			System.out.println( amount +"credited successfully");
			System.out.println("balnce in main balance" + currentAccount.getBalance());
			System.out.println("balnce in creditlimit balance" + currentAccount.getCreditlimit());	}
		}
		

    
public void chooseOperation() {
	Scanner sc = null;
	int choice;
	boolean flag = true;
		while (flag) {

			System.out.println("\n" + "Select one of the options below");
			System.out.println("1. Withdraw" + "\n" + "2. Deposite" + "\n" + "3. Display Details" + "\n" + "4. Exit");
			sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter amount to be withdraw\n");
				withdraw(sc.nextDouble());
				break;
			}

			case 2: {
				System.out.println("Enter amount to be deposite\n");
				deposite(sc.nextDouble());
				break;
			}
			case 3:
				System.out.println("Holder name: "+currentAccount.getHolder_name());
				System.out.println("Account number: "+currentAccount.getAcc_no());
				System.out.println("Account Type name: "+currentAccount.getAcc_type());
				System.out.println("Account Balance: "+currentAccount.getBalance());
				break;

			case 4: {
				System.out.println("Transaction complete\n");
				flag = false;
				 break;
			}
			case 5: 
				
			default: {
				System.out.println("Enter Valid operation\n");
				break;
			}
			}

		}

}
}