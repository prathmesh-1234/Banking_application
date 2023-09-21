package backingapplicatio;

public class CurrentAccount extends Account{
private static final double OVERDRAFT=5000;
	public CurrentAccount(int actID, String acnName, double balance) {
		super(actID, acnName, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		balance+=amount;
		System.out.println(amount+ " deposited successfully...!");
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(balance+OVERDRAFT>=amount)
		{
			balance-=amount;
			System.out.println(amount+ "withdrawn successfully...!");
		}
		else
		{
			System.out.println("Insufficient Balance...!");
		}
	}
	@Override
	public void calculateInterest(double rate, int years) {
		// TODO Auto-generated method stub
		System.out.println("Interest is not applicable for current account");
		
	}

}
