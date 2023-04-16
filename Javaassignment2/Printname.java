package Javaassignment2;
import java.util.Scanner;
public class Printname {
	static void printname(String str)
	{
		System.out.println("Hello,"+str+"!");
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String str=sc.nextLine();
		printname(str);
		sc.close();
	}
	
}
