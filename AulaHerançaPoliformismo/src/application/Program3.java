package application;

import java.util.ArrayList;
import java.util.List;

import entities.BusinessAccount;
import entities.SavingAccount;
import entities.acount;

public class Program3 {

	public static void main(String[] args) {
		
		List<acount> list = new ArrayList<>();
		
		list.add(new SavingAccount(1001, "Alex", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		for (acount acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for (acount acc : list) {
			acc.deposit(10.0);
		}
		for (acount acc : list) {
			System.out.printf("Updated balance for acount %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}

}
