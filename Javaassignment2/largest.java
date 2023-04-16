package Javaassignment2;
import java.util.Scanner;
public class largest {
	public static int Getmax(int a,int b,int c)
	{
		if(a>b && a>c)
		{
			return a;
		}
		else if(b>a && b>c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st integer:");
		int a=sc.nextInt();
		System.out.println("Enter 2nd integer:");
		int b=sc.nextInt();
		System.out.println("Enter 3rd integer:");
		int c=sc.nextInt();
		System.out.println("The largest integer is:"+Getmax(a,b,c));
		sc.close();
	}

}
