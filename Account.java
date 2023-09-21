package backingapplicatio;

abstract class Account {
		
	     protected int actID;
	    protected String acnName;
	    protected double balance;

	    public Account(int actID, String acnName, double balance) {
	        this.actID = actID;
	        this.acnName = acnName;
	        this.balance = balance;
	    }

	    public abstract void deposit(double amount);
	    public abstract void withdraw(double amount);
	    public abstract void calculateInterest(double rate, int years);
	    
	    @Override
		public String toString() {
			// TODO Auto-generated method stub
			return "actID is "+actID+"account holder name is: "+acnName+"balance is: "+balance;
		}
	}

