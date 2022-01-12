import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("select account type");
		System.out.println("1.saving\n2.current");
		int choice = scan.nextInt();
		System.out.println("enter account opening balance");
		double amount = scan.nextDouble();
		
		AccountFactory accountFactory = new AccountFactory();
		//need to store returned object in some variable
		Account ac = accountFactory.createAccount(choice, amount);
		//Account ac = null;
		boolean flag = true;
		
		while(flag) {
			
			System.out.println("select mode of transaction");
			System.out.println("1.deposit\n2.withdraw\n3.check balance\n4.exit");
			int transaction = scan.nextInt();
			
			switch(transaction) {
			
			case 1:										//deposit
				System.out.println("enter amount");
				double depositAmount = scan.nextDouble();
				ac.deposit(depositAmount);
				break;
				
			case 2:										//withdraw
				System.out.println("enter amount");
				double withdrawAmount = scan.nextDouble();
				ac.withdraw(withdrawAmount);
				break;
			
			case 3:										//checkBalance
				ac.checkBalance();
				break;
				
			case 4:
				flag = false;
				break;
			
			default:
					System.out.println("invalid choice");
				
			}
		}
		
	}
}
