package Javaassignment2;
import java.util.Scanner;

public class primenumber {

	
	static boolean Isprime(int n)
	{
		int count=0;
		boolean a=true;
		boolean b=false;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			return a;
		}
		else 
		{
			return b;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		System.out.println(Isprime(n));
	}

}