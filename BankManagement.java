package backingapplicatio;
import java.util.Scanner;
	public class BankManagement {
		Scanner sc = new Scanner(System.in);
		Account account[]=new Account[100];
		int pos=0;
		public void openAccount()
		{
			System.out.println("---Open Account---");
			System.out.println("1. Saving Account"+
							   "\n2. Salary Account"+
							   "\n 3. Current Account"+
							   "\n4. Loan Account");
			System.out.println("Enter the account type");
			int type=sc.nextInt();
			 System.out.print("Enter the account ID: ");
		        int accountID = sc.nextInt();
		        sc.nextLine(); 
		        System.out.print("Enter the account holder name: ");
		        String accountName = sc.nextLine();
		        System.out.println("Enter the initial balance");
		        double balance = sc.nextDouble();
			switch(type)
			{
				case 1: 
				account[pos]=new SavingsAccount(accountID,accountName,balance);
				System.out.println("Saving Account Opened Successfully...!");
				pos++;
				break;
				case 2: 
					account[pos]=new SalaryAccount(accountID, accountName, balance);
					System.out.println("Salary Account Opened Successfully...!");
					pos++;
					break;
				case 3: 
					account[pos]=new CurrentAccount(accountID, accountName, balance);
					System.out.println("Salary Account Opened Successfully...!");
					pos++;
					break;
				case 4: 
					account[pos]=new LoanAccount(accountID, accountName, balance);
					System.out.println("Salary Account Opened Successfully...!");
					pos++;
					break;
				default: System.out.println("Invalid account type");
			}
			for(int i=0;i<pos;i++)
			{
				System.out.println(account[i]);
			}
		}
		public void login()
		{
			System.out.println("Enter the account ID");
	        int accountID = sc.nextInt();
	        for(int i=0;i<pos;i++)
	        {
	        	if(account[i]!=null){
	        	if(account[i].actID==accountID)
	        	{
	        		boolean loggedIn = true;
	        		while(loggedIn)
	        		{
	        			System.out.println("Welcome! You are logged in as: "+account[i].acnName);
	        			System.out.println("1. Deposit");
		                System.out.println("2. Withdraw");
		                System.out.println("3. Check Balance");
		                System.out.println("4. Daily Transaction Report");
		                System.out.println("5. Calculate Interest");
		                System.out.println("6. Logout");
		                System.out.println("Enter your choice");
		                int ch = sc.nextInt();
		                switch(ch){
		                case 1: System.out.print("Enter the amount to deposit: ");
	                    double depositAmount = sc.nextDouble();
	                   // scanner.nextLine(); // Consume newline character
	                    account[i].deposit(depositAmount);
	                    break;
		                case 2: System.out.print("Enter the amount to withdraw: ");
	                    double withdrawAmount = sc.nextDouble();
	                    account[i].withdraw(withdrawAmount);
	                    break;
		                case 3:
	                    System.out.println("Account Balance: " + account[i].balance);
	                    break;
		                case 4:
	                        generateDailyTransactionReport();
	                        break;
	                    case 5:
	                        account[i].calculateInterest(2.5,3);
	                        break;
	                    case 6:
	                        loggedIn = false;
	                        System.out.println("Logged out successfully.");
	                        break;
	                    default:
	                        System.out.println("Invalid choice. Please try again.");
		                }
	        		}
	        		
	        	}
	        	else{
	        		System.out.println("Account not found !");
	        	}
	        }
	        }
		}
		
		
		public void generateDailyTransactionReport()
		 {
			 System.out.println("TBC");
		 }
		public void closeAccount()
		{
			System.out.println("---Close Account---");
			System.out.println("Enter Account ID");
			   int accountID = sc.nextInt();
			   for(int i=0;i<pos;i++)
			   {
				   if(account[i]!=null){
					   if(account[i].actID==accountID)
					   {
						   System.out.println("Account closed successfully for account number"+account[i].actID);
						   account[i]=null;
					   }
					   else
						   System.out.println("Invalid account number");
				   }
			   }
		}
	}


