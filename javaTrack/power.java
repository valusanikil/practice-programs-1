package javaTrack;
import java.util.Scanner;
public class power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int e=sc.nextInt();
		int result=(int) Math.pow(b,e);
		
		result=result%10;
		System.out.println("The last digit is:"+result);
		
	}

}
