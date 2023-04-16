package javaTrack;
import java.util.Scanner;
public class proj3_1_LearningPackages {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("which of the packages do you want:");
		int n=sc.nextInt();
		System.out.println("how many courses you enrolled:");
		int m=sc.nextInt();
		int pack1=10;
		int pack2=12;
		int pack3=15;
		if(n==1 && m==2)
		{
			System.out.println(pack1+"$");
		}
		else if(n==2 && m==4)
		{
			System.out.println(pack2+"$");
		}
		else if(n==3 && m==6)
		{
			System.out.println(pack3+"$");
		}
	}

}
