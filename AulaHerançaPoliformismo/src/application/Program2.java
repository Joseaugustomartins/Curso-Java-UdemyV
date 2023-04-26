package application;

import entities.SavingAccount;
import entities.acount;

public class Program2 {

	public static void main(String[] args) {
		
		acount x = new acount(1020, "Alex", 1000.0);
		acount y = new SavingAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}