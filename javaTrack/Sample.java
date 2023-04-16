package javaTrack;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Sample {

	public static void main(String[] args) {
		Scanner infile;
		try
		{
			infile=new Scanner(new File("input.txt"));
			int input;
			int sum=0;
			while(infile.hasNext())
			{
				input=infile.nextInt();
				sum=sum+input;
			}
			System.out.println("sum is: "+sum);
			
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("file not found!");
		}
	}

}
