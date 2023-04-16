package Javaassignment3;

public class matrixmul {
	public static void main(String[] args)
	{
		int m1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int m2[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int res[][]=new int[3][3];
		int sum=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					sum=sum+m1[i][k]*m2[k][j];
				}
				res[i][j]=sum;
				sum=0;
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(res[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
