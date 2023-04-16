package Javaassignment2;
import java.util.Scanner;
public class Primelist {
	public static void prime(int a,int b)
	{
		if(a<b)
		{
			for(int i=a;i<=b;i++)
			{
				int count=0;
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					System.out.print(","+i);
				}
				
			}
		}
		else
		{
			System.out.println("(empty list)");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first integer:");
		int a=sc.nextInt();
		System.out.println("Enter the last integer:");
		int b=sc.nextInt();
		prime(a,b);
		sc.close();
	}

}
