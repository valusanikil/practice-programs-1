package javaTrack;
import java.util.Scanner;
public class MethodOverloading {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		maxValue(x,y);
		maxValue(x,y,z);
	}
	public static void maxValue(int x,int y)
	{
		if(x>y)
		{
			System.out.println(x+" is greater");
		}
	}
	public static void maxValue(int x,int y,int z)
	{
		if(x>y && x>z)
		{
			System.out.println(x+" is greater");
		}
		else if(y>x && y>z)
		{
			System.out.println(y+" is greater");
		}
		else
		{
			System.out.println(z+" is greater");
		}
	}
	
}
