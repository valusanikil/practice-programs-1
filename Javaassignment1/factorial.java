package Javaassignment1;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		int fact=1;
			Scanner sc=new Scanner(System.in);
			System.out.println("Initialize/receive an integer value:");
			int n=sc.nextInt();
			fact(fact, n);
			sc.close();
	}

	private static void fact(int fact, int n) {
		for(int i=n;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of a given number is:" +fact);
	}

}
