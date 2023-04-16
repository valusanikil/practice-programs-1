package javaTrack;
import java.util.Scanner;
public class Proj3_2_DivisibleByThree {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer:");
		int n=sc.nextInt();
		if(n%3==0)
		{
			System.out.println(n+" is divisible by 3");
		}
		else
		{
			System.out.println(n+" is NOT divisible by 3");
		}
	}

}
