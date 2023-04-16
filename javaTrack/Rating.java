package javaTrack;
import java.util.Scanner;
public class Rating {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please, enter your rating:");
		int rating=sc.nextInt();
		if(rating<=2 && rating>=1)
		{
			System.out.println("Bad Rating");
		}
		else if(rating==3)
		{
			System.out.println("Average Rating");
		}
		else if(rating>=3 && rating<=5)
		{
			System.out.println("Good Rating");
		}
	}
}
