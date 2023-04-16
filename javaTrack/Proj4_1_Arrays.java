package javaTrack;
import java.util.Scanner;
public class Proj4_1_Arrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer");
		int n=sc.nextInt();
		System.out.println("enter the values");
		int[] arr=new int[5];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr[i]*2;
		}
		System.out.println("the multiplied values are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
