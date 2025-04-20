package oopsConcepts;

public class BankAccount {
//Class/Instance Vars
	String accountHolderName;
	int accountNumber;
	double balance;
	double initialBalance;
//Create a Constructor to initialize the bank account objects
	public BankAccount(String accountHolderName,int accountNumber )
	{
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
	}
//Create deposit(double amount) Method
	public void deposit(double amount1)
	{
		initialBalance = 5000;
		balance = initialBalance+amount1;
		System.out.println("Deposit of ₹"+amount1+" successful. Updated balance: "+ "₹"+balance);
	}
//Create withdraw(double amount) Method
	public void withdraw(double amount)
	{
		if(balance>amount)
		{
		 balance -= amount;
		System.out.println("Withdrawal Amount is :"+" "+amount);
	} else
	{
		System.out.println("Insufficent Funds for Withdrawal");
	}
	}
//Create checkBalance() Method
	public void checkBalance()
	{
		System.out.println("Current balance: ₹"+balance);
	}
	
	public static void main(String args[])
	{
		BankAccount bankobj = new BankAccount("Usman", 123456);
		bankobj.deposit(10000);
		bankobj.withdraw(3000);
		bankobj.checkBalance();
	}

}
