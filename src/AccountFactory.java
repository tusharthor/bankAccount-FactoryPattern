//factory class

public class AccountFactory {
	
	//factory method
	Account createAccount(int actype, double balance) {
		
		Account account = null;
		if(actype==1) {
			account = new SavingAccount(balance);		//upcasting
		}
		else if(actype==2) {
			account = new CurrentAccount(balance);		//upcasting
		}
		
		// need to pass the object (Account type) to main class
		return account;
	}

}
