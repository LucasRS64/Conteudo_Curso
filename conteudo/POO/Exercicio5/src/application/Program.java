package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		Conta account;
		
		System.out.print("Enter account number: ");
		int numConta = s.nextInt();
		System.out.print("Enter account holder: ");
		s.nextLine();
		String titular = s.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char x = s.next().charAt(0);
		if (x == 'y') {
			
			System.out.print("Enter inital depisut value: ");
			double initalDeposit = s.nextDouble();
			account = new Conta(numConta, titular, initalDeposit);
		}
		else {
			account = new Conta(numConta, titular);	
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = s.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);			
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = s.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		s.close();
		
	}

}
