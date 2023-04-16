package Objectoriented;
import java.util.Scanner;
public class Customer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		customer1 cust=new customer1();
		System.out.println("Enter Customer Details:");
		System.out.println("ID:");
		cust.setId(sc.nextInt());
		cust.setName("john");
		System.out.println("Gender:");
		cust.setGender(sc.next().charAt(0));
		cust.setEmail("john@a.com");
		System.out.println("Contact Number:");
		cust.setContactNumber("+997-4854-7485965123");
		System.out.println("customer id: "+cust.getId());
		System.out.println("customer: "+cust.getName());
		System.out.println("Customer Contact Details: "+cust.getContactNumber()+","+cust.getEmail());
		
	}

}
class customer1
{
	private long id;
	private String name;
	private char gender;
	private String email;
	private String contactNumber;
	public void setId(long id)
	{
		this.id=id;
	}
	public long getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setGender(char gender)
	{
		this.gender=gender;
	}
	public char getGender()
	{
		return gender;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getEmail()
	{
		return email;
	}
	public void setContactNumber(String contactNumber)
	{
		this.contactNumber=contactNumber;
	}
	public String getContactNumber()
	{
		return contactNumber;
	}
}