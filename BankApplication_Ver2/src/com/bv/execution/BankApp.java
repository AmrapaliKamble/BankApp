/*package com.bv.execution;

import com.bv.model.Account;
import com.bv.model.SalaryAccount;
import com.bv.model.SavingAccount;
import com.bv.serviceimpl.SalaryAccountService;
import com.bv.serviceimpl.SavingAccountService;

public class BankApp {

	public static void main(String[] args) {
		Account salAccount = new SalaryAccount(102, "SalaryAccountHolder", 4000, true);
		Account savingAccount1 = new SavingAccount(101, "Parvati", 5000,true);
		System.out.println("Acco no: "+savingAccount1.getAcc_no());
		System.out.println("Holder name: "+savingAccount1.getHolder_name());
		System.out.println("Balance: "+savingAccount1.getBalance());
		System.out.println("Limit charges: "+((SavingAccount) savingAccount1).getLimit_charges());
		System.out.println("Minimm balance to be maintained: "+((SavingAccount) savingAccount1).getMin_balance());
		
		SavingAccountService savingAccountService = new SavingAccountService((SavingAccount)savingAccount1);
		savingAccountService.deposite(500);
		savingAccountService.withdraw(5450);
		
		System.out.println("-------------------------------");
		
		System.out.println("Acco no: "+salAccount.getAcc_no());
		System.out.println("Holder name: "+salAccount.getHolder_name());
		System.out.println("Balance: "+salAccount.getBalance());
		System.out.println("Credit card Issued: "+((SalaryAccount) salAccount).isCreditCardIssued());
		
		SalaryAccountService salaryAccountService = new SalaryAccountService((SalaryAccount) salAccount);
		salaryAccountService.withdraw(1000);
		salaryAccountService.deposite(100);
		
	}

}
*/

package com.bv.execution;

import java.util.Scanner;

import com.bv.model.Account;
import com.bv.model.CurrentAccount;
import com.bv.model.SavingAccount;
import com.bv.serviceimpl.CurrentAccountRepository;
import com.bv.serviceimpl.SavingAccountService;
import com.bv.serviceimpl.SavingAccountsRepository;
import com.bv.serviceimpl.Services;

public class BankApp {

	public static void main(String[] args) {
		
		/*Account savingAccount = new SavingAccount(101, "Parvati", 5000, true);

		SavingAccountService savingAccountService = new SavingAccountService((SavingAccount) savingAccount);
		savingAccountService.chooseOperation();
		
		
		Account savingAccount1 = new SavingAccount(102, "Dhaval", 2000, false);

		SavingAccountService savingAccountService1 = new SavingAccountService((SavingAccount) savingAccount1);
		savingAccountService1.chooseOperation();*/
		//Account savingAccount = new SavingAccount(101, "Parvati", 5000, true);
	/*	Account savingAccount;
		Scanner sc = new Scanner(System.in);
		int accountType;
		boolean flag = true;
		int accNo;
		String holderName;
		double initialBal;
		boolean isSalary;
		int isSal;

		while(flag) {
			System.out.println("Choose the type of account \n 1)Saving \n 2)Current");
			accountType = sc.nextInt();
			switch(accountType) {
			case 1:	accDetails();
					System.out.println("Enter Acc No.");
					accNo = sc.nextInt();
					System.out.println("Enter Your Name");
					holderName = sc.nextLine();
					System.out.println("Initial Amount to be deposited");
					initialBal = sc.nextDouble();
					//label:
					System.out.println("Is Salary Account \n 1) yes 2)No");
					isSal = sc.nextInt();
					if(isSal == 1 || isSal==2) {
						
					}else {
						System.out.println("Enter valid details");
						//continue label;
					}
					
					break;
			case 2:
					break;
			case 3:
					break;
			default:
					break;
			}

		}
		
		//SavingAccountService savingAccountService = new SavingAccountService((SavingAccount) savingAccount);
		//savingAccountService.choose();
		
		
		Account savingAccount1 = new SavingAccount(102, "Dhaval", 2000, false);

		SavingAccountService savingAccountService1 = new SavingAccountService((SavingAccount) savingAccount1);
		savingAccountService1.choose();
	}
*/
			
	/*		SavingAccountsRepository savingRepo = new SavingAccountsRepository();
			System.out.println(savingRepo.getAllAccounts());
			System.out.println(savingRepo.getAccount(101));
			SavingAccount savingAccount = new SavingAccount(103, "Kajal", 10000, true);
			System.out.println(savingRepo.addAccount(savingAccount));
			System.out.println(savingRepo.getAllAccounts());
			System.out.println(savingRepo.removeAccount(102));
			System.out.println("After Deletion");
			System.out.println(savingRepo.getAllAccounts());
			

		}*/
		
		/*	Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice \n 1.current account \n 2.savings account \n 3.Add account");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter your account no");
				int accno = sc.nextInt();
				CurrentAccountRepository currentrepo = new CurrentAccountRepository();
				currentrepo.getAccount(accno);
				break;
			case 2:
				System.out.println("Enter your account no");
				int accnoo = sc.nextInt();
				SavingAccountsRepository  savingrepo = new SavingAccountsRepository();
				savingrepo.getAccount(accnoo);
				break;
			case 3:
				SavingAccountsRepository savingRepo = new SavingAccountsRepository();
				System.out.println("Enter account no");
				int accno1 = sc.nextInt();
				System.out.println("Enter Holder's name");
				String holdername = sc.next();
				System.out.println("Enter balance");
				double bal = sc.nextDouble();
				
				System.out.println("which account you want to add 1.savings \n 2. current account");
			
				int ch = sc.nextInt();
				if(ch == 1) {
					System.out.println("Want a Salary account T/F");
					boolean type = sc.hasNext();
				
					SavingAccount savingAccount = new SavingAccount(accno1,holdername , bal, type);
					savingRepo.addAccount(savingAccount);
				
					System.out.println("Account added successfully");
					savingRepo.getAllAccounts();
					System.out.println(savingAccount);

				}else if(ch == 2) {
					CurrentAccountRepository currentrepo1 = new CurrentAccountRepository();

					System.out.println("enter creditlimit");
					double creditlimit = sc.nextDouble();
					CurrentAccount currentAccount = new CurrentAccount(accno1, "holdername", bal,creditlimit);
					currentrepo1.addAccount(currentAccount);
					System.out.println("Account added successfully");
					System.out.println();
					currentrepo1.getAllAccounts();
					System.out.println(currentAccount);
				}
				
				
			}*/
		
		Services sv = new Services();
		sv.execute();

	}
		
	}


