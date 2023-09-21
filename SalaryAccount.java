package backingapplicatio;

public class SavingsAccount extends Account{
	private static final double MINBALANCE=10000;

	public SavingsAccount(int actID, String acnName, double balance) {
		super(actID, acnName,balance);
	}
	@Override
	public void deposit(double amount) {
		balance+=amount;
		System.out.println(amount + " deposited successfully to saving account.");
	}
	@Override
	public void withdraw(double amount) {
		if(balance-amount>=MINBALANCE){
			balance-=amount;
			System.out.println(amount + " withdrawn successfully.");
		}
		else
			System.out.println("Insufficient balance...");
	}
	@Override
	public void calculateInterest(double rate, int years) {
		double interest=(balance*rate*years)/100;
		balance+=interest;
		System.out.println("Interested added and now balance is: "+balance);
		
	}

	
}

