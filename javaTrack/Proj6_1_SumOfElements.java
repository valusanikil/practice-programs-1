package javaTrack;
import java.util.Scanner;
import java.util.ArrayList;
public class Proj6_1_SumOfElements {

	public static void main(String[] args) {
		ArrayList<Integer> array=new ArrayList<Integer>();
		array.add(10);
		array.add(20);
		array.add(30);
		array.add(40);
		array.add(50);
		int result=sumElements(array);
		System.out.println("The sum is:"+result);
	}
	public static int sumElements(ArrayList<Integer> arr)
	{
		int sum=0;
		for(int i=0;i<arr.size();i++)
		{
			sum=sum+arr.get(i);
		}
		return sum;
	}
}
