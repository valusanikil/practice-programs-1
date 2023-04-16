package javaTrack;
import java.util.Scanner;
public class JavaAssignment2_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[10];
		int[] b=new int[10];
		System.out.println("Enter the values:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The reversed order is:");
		for(int i=a.length-1;i>=0;i--)
		{
			b[i]=a[i];
			System.out.println(b[i]);
		}
	}
}
