package javaTrack;
import java.util.Scanner;
import java.util.ArrayList;
public class Proj5_1_Name_Perm {

	public static void main(String[] args) {
		ArrayList<String> firstNames=new ArrayList<String>();
		ArrayList<String> lastNames=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		String fullName;
		String firstName;
		String lastName;
		int indexOfSpace;
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the name:"+(i+1));
			fullName=sc.nextLine();
			indexOfSpace=fullName.indexOf(" ");
			firstName=fullName.substring(0,indexOfSpace);
			lastName=fullName.substring(indexOfSpace+1);
			firstNames.add(firstName);
			lastNames.add(lastName);
		}
		for(int i=0;i<firstNames.size();i++)
		{
			for(int j=0;j<lastNames.size();j++)
			{
				System.out.println(firstNames.get(i)+" "+lastNames.get(j));
			}
			System.out.println();
		}
	}
}
