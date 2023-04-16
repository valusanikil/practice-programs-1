package javaTrack;
import java.util.Random;
import java.util.Scanner;
public class Proj3_3_GuessTheNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		
		int value=random.nextInt(100)+1;
		System.out.println("Enter your value");
		for(int i=0;i<50;i++)
		{
			int n=sc.nextInt();
			if(n>=1 && n<=100)
			{
				if(n==value)
				{
					System.out.println("\"Correct number : Congratulations!"
							  + "you guessed the number in "+i+
						    " guesses thanks for playing\"");
				}	 
				else if(n>value)
				{
					System.out.println("your guess is too high");
				}
				else if(n<value)
				{
					System.out.println("your guess is too low");
				}
			}
			else
			{
				System.out.println("\"That was wasted guess! Pick a number"
						     + "that is between 1 and 100,inclusive\"");
			}
		}
	}

}
