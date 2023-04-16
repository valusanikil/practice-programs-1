package Javaassignment2;
public class Matrix {

	public static void main(String[] args) {
		int rows=2,columns=3;
		int[][] FM= {{1,2,3},{4,5,6}};
		int[][] SM= {{4,5,6},{7,8,9}};
		int[][] sum=new int[rows][columns];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				sum[i][j]=FM[i][j]+SM[i][j];
			}
		}
		System.out.println("sum pf two matrices is:");
		for(int[] row:sum) {
			for(int column:row)
			{
				System.out.print(column+" ");
			}
			System.out.println();
		}
	}

}
