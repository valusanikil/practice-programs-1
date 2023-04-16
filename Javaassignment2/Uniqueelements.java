package Javaassignment2;
import java.util.Scanner;
public class Uniqueelements {
	public static void isUnique(int n,int m,int[] a,int[] b,int[] c)
	{
		System.out.print("{");
		for(int i=0;i<n+m;i++)
		{
			int count=0;
			for(int j=0;j<n+m;j++)
			{
				if(c[i]==c[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print(c[i]);
				if(i>=0 && i<n+m-1)
				{
					System.out.print(",");
				}
			}
		}
		System.out.print("}");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array1 size:");;
		int n=sc.nextInt();
		System.out.println("Enter the Array 2 size:");
		int m=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[m];
		int[] c=new int[n+m];
		System.out.println("Array1 elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array2 elements:");
		for(int i=0;i<m;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<m;i++)
		{
			c[n+i]=b[i];
		}
		isUnique(n,m,a,b,c);
		sc.close();
	}

}
