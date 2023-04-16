package Javaassignment2;
import java.util.Scanner;
public class Reverseorder {
	public static int reverse(int n)
	{
		int rem,sum=0;
		while(n!=0)
		{
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Integer:");
		int n=sc.nextInt();
		System.out.println(reverse(n));
		sc.close();
	}

}
