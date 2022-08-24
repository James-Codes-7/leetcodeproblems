package leetcoded11;

import java.util.Scanner;

public class Spiral_Matrix {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the row");
		int row=scan.nextInt();

		System.out.println("Enter the column");
		int col=scan.nextInt();

		int mat[][]=new int[row][col],i=0,j=0,x=0,y=0;
		System.out.println("Enter the elements to the matrix");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				mat[i][j]=scan.nextInt();
			}
		}
		System.out.println("Output:");
		for(i=0;i<=row/2;i++)
		{
			j=i;
			for(x=i,y=j;y<col-i;y++)
			{
				System.out.print(mat[x][y]+" ");
			}
			for(x=i+1,y=col-1-i;x<row-i;x++)
			{
				System.out.print(mat[x][y]+" ");
			}
			for(x=row-1-i,y=y-1;y>i;y--)
			{
				System.out.print(mat[x][y]+" ");
			}
			for(x=row-1-i,y=j;x>i;x--)
			{
				System.out.print(mat[x][y]+" ");
			}


		}

	}
	/*Spiral Matrix
	 * 
	 * Enter the row
3
Enter the column
4
Enter the elements to the matrix
1 2 3 4
5 6 7 8
9 10 11 12
Output:
1 2 3 4 8 12 11 10 9 5 6 7 
	 * 
	 */

}
