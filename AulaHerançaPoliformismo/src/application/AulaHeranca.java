package application;

import entities.BusinessAccount;
import entities.SavingAccount;
import entities.acount;

public class AulaHeranca {

	public static void main(String[] args) {
		
		//acount acc = new acount(1001, "Alex", 0.0);
		//BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		
		//acount acc1 = bacc;
		acount acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		acount acc3 = new SavingAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingAccount) {
			SavingAccount acc5 = (SavingAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}
	}

}
