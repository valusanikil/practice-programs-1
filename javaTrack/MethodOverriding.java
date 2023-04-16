package javaTrack;
import java.util.Scanner;
public class MethodOverriding {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		Max m=new Max();
		m.value(a, b);
	}
}
class Max extends MethodOverriding
{
	public void value(int a,int b)
	{
		if(a>b)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(b);
		}
	}
}
