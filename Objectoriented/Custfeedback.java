package Objectoriented;
import java.util.Scanner;
public class Custfeedback {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of customers:");
		int n=sc.nextInt();
		cust[] feedback=new cust[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name of customer "+(i+1));
			String name=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter the mobile no of customer "+(i+1));
			String mobileNo=sc.nextLine();
			System.out.println("Enter the feedback of the customer "+(i+1));
			double feedbackRating=sc.nextDouble();
			feedback[i]=new cust(name,mobileNo,feedbackRating);
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("customer "+(i+1)+" : "+feedback[i].getfeedbackRating()+" out of 5");
		}
		
		
	}

}
class cust
{
	public String name;
	public String mobileNo;
	public double feedbackRating;
	public cust()
	{
		
	}
	public cust(String name,String mobileNo,double feedbackRating)
	{
		this.name=name;
		this.mobileNo=mobileNo;
		this.feedbackRating=feedbackRating;	
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setmobileNo(String mobileNo)
	{
		this.mobileNo=mobileNo;
	}
	public String getmobileNo()
	{
		return mobileNo;
	}
	public void setfeedbackRating(double feedbackRating)
	{
		this.feedbackRating=feedbackRating;
	}
	public double getfeedbackRating()
	{
		return feedbackRating;
	}
	
}