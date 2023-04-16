package javaTrack;

public class Circle {
	private double radius;
	public Circle()
	{
		radius=1;
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double getRadius()
	{
		return radius;
	}
	public double circum()
	{
		return 2*Math.PI*radius;
	}
	public double area()
	{
		return Math.PI*Math.pow(radius,2);	
	}
	
}
