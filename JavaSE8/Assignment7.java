package JavaSE8;
import java.util.Scanner;
public class Assignment7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[3][3];
		System.out.println("Enter the values:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
