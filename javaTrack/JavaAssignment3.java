package javaTrack;
import java.util.Scanner;
public class JavaAssignment3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice:");
		String choice=sc.nextLine();
		int n=2;
		int m=3;
		int result;
		switch(choice)
		{
			case "add": result=m+n;
			System.out.println("The addition is:"+result);
			break;
			case "sub": result=m-n;
			System.out.println("The substraction is:"+result);
			break;
			case "mul": result=m*n;
			System.out.println("The multiplication is:"+result);
			break;
			case "div": result=m/n;
			System.out.println("The division is:"+result);
			break;
			case "mod": result=m%n;
			System.out.println("The remainder is:"+result);
			break;
			default:System.out.println("your choice is invalid");
			break;
		}
	}
}
