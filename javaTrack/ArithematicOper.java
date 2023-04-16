package javaTrack;
import java.util.Scanner;
public class ArithematicOper {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int add=a+b+c+d;
		System.out.println("the addition is:"+add);
		int sub=a-b-c-d;
		System.out.println("the substraction is:"+sub);
		int mul=a*b*c*d;
		System.out.println("the multiplication is:"+mul);
		double div=(a/b)+(c/d);
		System.out.println("the division is:"+div);
	}

}
