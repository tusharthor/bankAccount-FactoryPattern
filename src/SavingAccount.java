
public class SavingAccount implements Account {

	double accountBalance;

	public SavingAccount(double accountBalance) {
		// super();
		this.accountBalance = accountBalance;
		System.out.println("your saving account opened successfully");
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		accountBalance += amount;
		System.out.println(amount + " credited to your account");
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if (amount <= accountBalance) {
			accountBalance -= amount;
			System.out.println(amount + " debited from your account");
		} else {
			System.out.println("insufficient balance");
		}
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("your account balance is " + accountBalance);
	}

}
