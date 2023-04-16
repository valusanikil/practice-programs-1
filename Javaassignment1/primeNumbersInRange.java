package Javaassignment1;

public class primeNumbersInRange {
	public static void main(String[] args) {
		int m=20,n=50;
		int count;
		for(int i=m;i<=n;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0) 
				{
					count=count+1;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
	}
}
