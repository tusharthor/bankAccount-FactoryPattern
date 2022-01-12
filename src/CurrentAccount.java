
public class CurrentAccount implements Account {

	double accountBalance;
	
	public CurrentAccount(double accountBalance) {
		//super();
		this.accountBalance = accountBalance;
		System.out.println("your current account opened successfully");
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		accountBalance += amount;
		System.out.println(amount+" credited to your account");
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		accountBalance -= amount;
		System.out.println(amount+" debited from your account");
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("your account balance is "+accountBalance);
	}

	
}
