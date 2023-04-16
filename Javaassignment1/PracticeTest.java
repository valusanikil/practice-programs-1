package Javaassignment1;

import java.util.Scanner;

public class PracticeTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=0,v=0;
		int cons=0,vowel=0;
		System.out.println("Enter name:");
		String str=sc.nextLine();
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||
					str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vowel++;
			}
			else if(str.charAt(i) >= 'a' && str.charAt(i)<='z')
			{
				cons++;
			}
			
		}
		if(cons>vowel)
		{
			System.out.println("C");
		}
		else if(vowel>cons)
		{
			System.out.println("V");
		}
		else
		{
			System.out.println("E");
		}
	}

}
