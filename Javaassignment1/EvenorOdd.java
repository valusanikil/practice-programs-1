package Javaassignment1;
import java.util.Scanner;
public class EvenorOdd {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer:");
		int count=0;
		int n=sc.nextInt();
		while(n!=1){
			if(n%2==0){
				System.out.println(n+" is even so i take half:"+n/2);
				n=n/2;
			}
			else if(n%2!=0){
				System.out.println(n+" is odd so i make 3n+1:"+(n*3+1));
				n=n*3+1;
			}
			count++;
		}
		System.out.println("there are total "+count+" steps to reach 1");
		sc.close();
	}
}
