package javaTrack;

public class BankAccount {
	private String owner;
	private int balance;
	public BankAccount(String owner)
	{
		this.owner=owner;
		int balance=0;
	}
	public BankAccount(String owner,int balance)
	{
		this.owner=owner;
		this.balance=balance;
	}
	public void deposit(int amount)
	{
		if(amount>=0)
		{
			balance=balance+amount;
		}
		else
		{
			System.out.println("error");
		}
	}
	public void withdraw(int amount)
	{
		if(amount>=0 && balance>=amount)
		{
			balance=balance-amount;
		}
		else
		{
			System.out.println("error");
		}
	}
	public String getOwner() {
		// TODO Auto-generated method stub
		return owner;
	}
	public int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	
}