package Javaassignment3;
import java.util.Random;
import java.util.Scanner;
public class passwordgenerate {
	public static void main(String[] args) {
		  int len = 8;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Customer Name: ");
	        String name = sc.nextLine();
	        System.out.println("Customer Id: ");
	        String id = sc.nextLine();
	        System.out.println("Customer Age: ");
	        String age = sc.nextLine();
	        String symbols = "!@#$%^&*_=+-/.?<>)";
	        age=age.toLowerCase();
	        id=id.toLowerCase();
	        if(id.contains("a")|| id.contains("b")|| id.contains("c")
	        	|| id.contains("d") || id.contains("e") || id.contains("e")
	        	||id.contains("f") || id.contains("g") || id.contains("h")
	        	|| id.contains("i") || id.contains("j") || id.contains("k")
	        	|| id.contains("l") || id.contains("m") || id.contains("n")
	        	|| id.contains("o") || id.contains("p") || id.contains("q")
	        	|| id.contains("r") || id.contains("s") || id.contains("t")
	        	|| id.contains("u") || id.contains("v") || id.contains("w")
	        	|| id.contains("x") || id.contains("y") || id.contains("z"))
	        {
	        	System.out.println("Customer Id must be digit");
	        }
	        else if(age.contains("a")|| age.contains("b") || age.contains("c")
	        		|| age.contains("d") || age.contains("e") || age.contains("e")
	        		|| age.contains("f") || age.contains("g") || age.contains("h")
	        		|| age.contains("i") || age.contains("j") || age.contains("k")
	        		|| age.contains("l") || age.contains("m") || age.contains("n")
	        		|| age.contains("o") || age.contains("p") || age.contains("q")
	        		|| age.contains("r") || age.contains("s") || age.contains("t")
	        		|| age.contains("u") || age.contains("v") || age.contains("w")
	        		|| age.contains("x") || age.contains("y") || age.contains("z"))
	        		{
	        		System.out.println("Age must be digit");
	        		}
	        	else
	        	{
	        		String values = name + id +
	        		age + symbols;
	  	
	        		Random rndm_method = new Random();
	  
	        		char[] password = new char[len];
	  
	        		for (int i = 0; i < len; i++)
	        			{
	        			password[i] =values.charAt(rndm_method.nextInt(values.length()));
	  
	        			}
	        		System.out.println(password);
	        	}
	}

}
