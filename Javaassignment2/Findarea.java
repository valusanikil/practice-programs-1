package Javaassignment2;
import java.util.Scanner;
public class Findarea {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the figure:");
		String str=sc.nextLine();
		if(str.equals("triangle"))
		{
			double trianglearea;
			int side=sc.nextInt();
			int height=sc.nextInt();
			trianglearea=side*height/2;
			System.out.printf("%.2f",trianglearea);
		}
		if(str.equals("square"))
		{
			double squarearea;
			int side=sc.nextInt();
			squarearea=4*side;
			System.out.printf("%.2f",squarearea);
		}
		if(str.equals("rectangle"))
		{
			double rectanglearea;
			int width=sc.nextInt();
			int height=sc.nextInt();
			rectanglearea=width*height;
			System.out.printf("%.2f",rectanglearea);
		}
		if(str.equals("circle"))
		{
			double circlearea;
			int radius=sc.nextInt();
			circlearea=(22/7)*radius*radius;
			System.out.printf("%.2f",circlearea);
		}
		sc.close();
	}

}
