package javaTrack;
import java.util.ArrayList;
import java.util.Scanner;
public class Proj4_2_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Double> value=new ArrayList<Double>();
		System.out.println("Enter the values:");
		value.add(sc.nextDouble());
		value.add(sc.nextDouble());
		value.add(sc.nextDouble());
		value.add(sc.nextDouble());
		value.add(sc.nextDouble());
		System.out.println("the reversed elements are:");
		for(int i=value.size()-1;i>=0;i--)
		{
			System.out.println(value.get(i));
		}
		

	}

}
