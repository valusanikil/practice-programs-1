package javaTrack;
import java.util.Scanner;
import java.util.ArrayList;
public class Proj4_3_Parallel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> names=new ArrayList<String>();
		ArrayList<Integer> ages=new ArrayList<Integer>();
		String name;
		int age;
		for(int i=0;i<2;i++)
		{
			System.out.print("Enter the name:");
			name=sc.nextLine();
			System.out.print("Enter the age:");
			age=sc.nextInt();
			sc.nextLine();
			names.add(name);
			ages.add(age);
			System.out.println();
		}
		for(int i=0;i<names.size();i++)
		{
			System.out.println(names.get(i)+" is "+ages.get(i)+" years old");
		}
	}
}
