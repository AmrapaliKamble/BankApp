package com.bv.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.bv.map.DatabaseClass;
import com.bv.model.Account;
import com.bv.model.CurrentAccount;
import com.bv.model.SavingAccount;

public class CurrentAccountRepository {
	private Map<Integer, CurrentAccount> currentAccounts = DatabaseClass.getCurrentAccount();

	public CurrentAccountRepository() {
		super();
		currentAccounts.put(101, new CurrentAccount(101, "amrapali", 900));
		currentAccounts.put(103, new CurrentAccount(103, "kamble", 7800));

	}

	//select * from accounts
		public List<CurrentAccount> getAllAccounts()
		{
			return new ArrayList<CurrentAccount>(currentAccounts.values());
		}
		//select * from accounts where acc_no = ?
		public void getAccount(int acc_no)
		{
			Account currentAccount1 = currentAccounts.get(acc_no);
			 
			  CurrentAccountService currentAccountService1 = new
			  CurrentAccountService((CurrentAccount) currentAccount1);
			  currentAccountService1.chooseOperation();
			//return currentAccounts.get(acc_no);
		}
		public CurrentAccount addAccount(CurrentAccount currentAccount) {
			currentAccount.setAcc_no(currentAccount.getAcc_no()+0);
			currentAccounts.put(currentAccount.getAcc_no(),currentAccount);
			return currentAccount;
		}
		
		public Account updateAccount(CurrentAccount currentAccount)
		{
			if(currentAccount.getHolder_name().isEmpty())
			{
				return null;
			}
			currentAccounts.put(currentAccount.getAcc_no(), currentAccount);
			return currentAccount;
				
		}
		public Account removeAccount(int acc_no)
		{
			return currentAccounts.remove(acc_no);
		}
	
	
	
}
