package Javaassignment2;
import java.util.Scanner;
public class Sumarrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array 1 Integer:");
		int n=sc.nextInt();
		System.out.println("Enter the array 2 Integer:");
		int m=sc.nextInt();
		double[] a=new double[n];
		double[] b=new double[m];
		int[] c=new int[b.length];
		System.out.println("Enter the array 1 Elements:");
		for(int i=0;i<b.length;i++)
		{
			a[i]=sc.nextDouble();
		}
		System.out.println("Enter the array 2 Elements:");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextDouble();
		}
		for(int i=0;i<b.length;i++)
		{
			c[i]=(int)(a[i]+b[i]);
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(c[i]);
		}
		sc.close();
	}

}
