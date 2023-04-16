package kBA;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Sms
{
	String Name;
	int ID;
	String Category;
	String Brand;
	int Price;
	public void Sms(String Name,int ID,String Category,String Brand,int Price)
	{
		this.Name=Name;
		this.ID=ID;
		this.Category=Category;
		this.Brand=Brand;
		this.Price=Price;	
	}		
	public void newProduct(List<Sms> a)
	{
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i).Name);
			System.out.println(a.get(i).ID);
			System.out.println(a.get(i).Category);
			System.out.println(a.get(i).Brand);
			System.out.println(a.get(i).Price);
			System.out.println();
		}
		
	}
	public void listProduct(String b,int id2,List<Sms> a)
	{
		
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i).Name==b)
			{
		
				System.out.println(a.get(i).Name);
				System.out.println(a.get(i).ID);
				System.out.println(a.get(i).Category);
				System.out.println(a.get(i).Brand);
				System.out.println(a.get(i).Price);
			}
			if(a.get(i).ID==id2)
			{

				System.out.println(a.get(i).Name);
				System.out.println(a.get(i).ID);
				System.out.println(a.get(i).Category);
				System.out.println(a.get(i).Brand);
				System.out.println(a.get(i).Price);
			}
			
		
		}
		
	}
	public void searchProduct(int id,List<Sms> a)
	{
		int k=id;
		int c=0;
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i).ID==k)
			{
				System.out.println(a.get(i).Name);
				System.out.println(a.get(i).ID);
				System.out.println(a.get(i).Category);
				System.out.println(a.get(i).Brand);
				System.out.println(a.get(i).Price);
				c++;
			}
		}
			if(c==0)
				System.out.println("Product not found");
			
		
	}
	public void editProduct(String s,List<Sms> a)
	{
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i).Name==s)
			{
				a.get(i).Name="FAN";
				a.get(i).Price=50000;
				break;
			}
		}
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i).Name);
			System.out.println(a.get(i).ID);
			System.out.println(a.get(i).Category);
			System.out.println(a.get(i).Brand);
			System.out.println(a.get(i).Price);
			System.out.println();
		}
		
	}
	public void deleteProduct(int id1,List<Sms> a)
	{
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i).ID==id1)
			{
				a.remove(i);
				break;
			}
		}
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i).Name);
			System.out.println(a.get(i).ID);
			System.out.println(a.get(i).Category);
			System.out.println(a.get(i).Brand);
			System.out.println(a.get(i).Price);
			System.out.println();
		}
	
	}
}
public class Shopping {

	public static void main(String[] args) 
	{
		Sms obj=new Sms();
		Scanner ip=new Scanner(System.in);
		List<Sms> a=new ArrayList<Sms>(10);
		a.add(new Sms());
		a.get(0).Sms("TV",1,"Electronic Device","LG",10000);
		a.add(new Sms());
		a.get(1).Sms("COOLER",2,"Electronic Device","SONY",20000);
		a.add(new Sms());
		a.get(2).Sms("MOBILE",3,"Electronic Device","HONOR",30000);
		System.out.println("*Welcome To Shopping Management System*\n"
				+ "\n"
				+ "1) Add a new Product, id, author\r\n"
				+ "\n"
				+ "2) List all Product with name, Id\r\n"
				+ "\n"
				+ "3) Search Product with ID\r\n"
				+ "\r\n"
				+ "4) Edit Product by name\r\n"
				+ "\n"
				+ "5) Delete Product by ID\r\n"
				+ "\n"
				+ "6) Exit");
		System.out.println();
		System.out.println("Enter your Choice");
		int n=ip.nextInt();
		switch(n)
		{
		case 1 : System.out.println("Enter Product Name:");
				String name=ip.next();
				System.out.println("Enter Product ID:");
				int n1=ip.nextInt();
				System.out.println("Enter Product Category:");
				String category=ip.next();
				System.out.println("Enter Product Brand:");
				String brand=ip.next();
				System.out.println("Enter Product Price:");
				int price=ip.nextInt();
				a.add(new Sms());
				a.get(3).Sms(name, n1, category, brand, price);
				obj.newProduct(a);break;
		case 2 : System.out.println("Enter Product Name");
				String b=ip.nextLine();
				ip.nextLine();
				System.out.println("Enter Product ID");
				int id2=ip.nextInt();
			    obj.listProduct(b,id2,a);break;
		case 3 : System.out.println("Enter ID to search");
				 int id=ip.nextInt();
				 obj.searchProduct(id,a);break;
		case 4 : System.out.println("Enter Name to edit");
				String s=ip.next();
				obj.editProduct(s,a);break;
		case 5 : System.out.println("Enter Product ID");
		 		int id1=ip.nextInt();
		 		obj.deleteProduct(id1,a);break;
		case 6 : System.exit(0);
		}
	
	}
}