package Javaassignment2;
import java.util.Scanner;
public class Arraysum {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the integer:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("The sum is:"+sum);
		sc.close();
	}
}
