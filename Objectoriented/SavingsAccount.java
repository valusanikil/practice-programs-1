package Objectoriented;
class Account
{
	double balance;
	int interestRate;
	int accountNo;
	public Account()
	{
		
	}
	public Account(double balance,int interestRate,int accountNo)
	{
		this.balance=balance;
		this.interestRate=interestRate;
		this.accountNo=accountNo;
	}
	public void withDraw(double amount)
	{
		amount=2950.50;
		if(amount>balance)
		{
			System.out.println("error message");
		}
		else
		{
			System.out.println("successfully withdrawn "+amount);
		}
	}
	public void calculateInterest()
	{
		double SI;
		int time=3;
		int rate=5;
		SI=(balance*time*rate)/100;
		System.out.println(SI);
	}
}
class SavingsAccount
{
	public static void main(String[] args)
	{
		double balance = 0;
		int interestRate = 0;
		int accountNo = 0;
		Account account=new Account(balance,interestRate,accountNo);
		account.balance=2950.50;
		account.interestRate=5;
		account.accountNo=511;
		double amount=0;
		account.withDraw(amount);
		account.calculateInterest();
	}
}
