package javaTrack;
import java.util.Scanner;
public class proj2_1_AverageOfThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");
		int a=sc.nextInt();
		System.out.println("enter b value:");
		int b=sc.nextInt();
		System.out.println("enter c value:");
		int c=sc.nextInt();
		int result=(a+b+c)/3;
		System.out.println("the average of five numbers is:"+result);
	}

}
