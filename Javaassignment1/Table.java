package Javaassignment1;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=2;
		for(int i=0;i<=12;i++)
		{
			System.out.println(n+"x"+i+"="+n*i);
		}
		sc.close();
	}

}
