package javaTrack;

public class BankAccountDemo {

	public static void main(String[] args) {
		BankAccount nikilAccount=new BankAccount("Nikil",5000);
		BankAccount vakulAccount=new BankAccount("Vakul");
		nikilAccount.deposit(5000);
		System.out.println("the owner is:"+nikilAccount.getOwner());
		System.out.println("balance:"+nikilAccount.getBalance());
		nikilAccount.withdraw(1000);
		System.out.println("the owner is:"+nikilAccount.getOwner());
		System.out.println("balance:"+nikilAccount.getBalance());
		System.out.println();
		nikilAccount.deposit(1000);
		System.out.println(nikilAccount.getOwner());
		System.out.println(nikilAccount.getBalance());
		
	}
}
