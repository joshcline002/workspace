import java.util.Scanner;

public class Account
{
	private double balance;
	private String name;
	private long acctNum;
	public static int numAccounts = 0;
	public static double newBalance;
	
	//----------------------------------------------
	//Constructor -- initializes balance, owner, and account number
	//----------------------------------------------
	public Account(double initBal, String owner, long number) throws Exception
	{
		if (initBal <=0)
			throw new Exception("Invalid amount");
		balance = initBal;
		name = owner;
		acctNum = number;
		numAccounts++;
	}
	
	//----------------------------------------------
	// Checks to see if balance is sufficient for withdrawal.
	// If so, decrements balance by amount; if not, prints message.
	//----------------------------------------------
	public void withdraw (double amount) throws Exception
	{
		if (amount <= 0)
			throw new Exception("Invalid amount");
		if (balance >= amount)
			balance -= amount;
		else
			throw new Exception("Insufficient Fund");
	}
	
	//----------------------------------------------
	// Adds deposit amount to balance.
	//----------------------------------------------
	public void deposit(double amount) throws Exception
	{
		if (amount <= 0)
			throw new Exception("Invalid amount");
		balance += amount;
	}
	
	//----------------------------------------------
	// Returns balance.
	//----------------------------------------------
	public double getBalance()
	{
		return balance;
	}
	
	//----------------------------------------------
	// Returns account number.
	//----------------------------------------------
	public long getAcctNumber()
	{
		return acctNum;
	}
	
	//----------------------------------------------
	// Changes account holder name.
	//----------------------------------------------
	public void ChangeAccountName(String newName)
	{
		this.name = newName;
	}
	
	//----------------------------------------------
	// Changes account number.
	//----------------------------------------------
	public void ChangeAccountNumber(long newAcctNumber)
	{
		this.acctNum = newAcctNumber;
	}

	//----------------------------------------------
	// Returns a string containing the name, account number, and balance.
	//----------------------------------------------
	public String toString()
	{
		return "Name: " + name +
		"\nAccount Number: " + acctNum +
		"\nBalance: " + balance;
	}
	
	
	public static int getNumAccounts()
	{
		return numAccounts;
	}
	
	public void close ()
	{
		name = name + "CLOSED";
		balance = 0;
		numAccounts--;
	}
	public static Account Accountconsolidate (Account acct1, Account acct2) throws Exception
	{
		//Added initialization at top of method. And changed both null returns to set this to null.
		Account newAccount;
		
		//made the second if part of the else if statement so that it would not run through everything
		//for when one fail. This also goes with not returning until the end.
		if (acct1.acctNum==acct2.acctNum)
		{
			System.out.print("Same account numbers cannot be consolidated.\n");
			newAccount = null;
		} else if (acct1.name != acct2.name) {
			System.out.print ("Different account names cannot be consolidated.\n");
			newAccount = null;
		} else
		{
			newBalance = acct1.balance + acct2.balance;
			//Creation of the new account here so that acct1.close() would not affect the name.
			newAccount = new Account (newBalance, acct1.name, 27);
			acct1.close();
			acct2.close();
		}
		//This is the return statement for the whole method.
		return newAccount;
	}
	
	

	public static void main(String[] args) throws Exception
	{
		Account testAcct;
	
		Scanner scan = new Scanner(System.in);
	
		System.out.print("How many accounts would you like to create?\n");
		int num = scan.nextInt();
	
		for (int i=1; i<=num; i++)
		{
			testAcct = new Account(100, "Name-"+i, i);
			System.out.print("\nCreated account " + testAcct);
			System.out.print("\nNow there are " + Account.getNumAccounts() +
			" accounts");
		}
		scan.close();
	}
	
	
}