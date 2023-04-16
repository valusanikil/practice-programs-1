package javaTrack;

public class CircleDemo {

	public static void main(String[] args) {
		Circle c1=new Circle();
		Circle c2=new Circle(5);
		Circle c3=new Circle(12.75);
		printCircleData(c1);
		printCircleData(c2);
		printCircleData(c3);

	}
	public static void printCircleData(Circle c2)
	{
		System.out.println(String.format("%.2f",c2.getRadius()));
		System.out.println(String.format("%.2f",c2.circum()));
		System.out.println(String.format("%.2f",c2.area()));
		System.out.println();
		
	}

}
