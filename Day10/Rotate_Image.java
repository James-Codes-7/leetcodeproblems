package leetcoded10;

import java.util.Scanner;

public class Rotate_Image {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the row size");
		int row=scan.nextInt();
		
		System.out.println("Enter the colomn size");
		int col=scan.nextInt();
		
		int i=0,j=0;
		int mat[][]=new int[row][col];
		System.out.println("Elements to the matrix");
		for(i=row-1;i>=0;i--)
		{
			for(j=0;j<col;j++)
			{
				mat[j][i]=scan.nextInt();
			}
		}
		System.out.println();
		System.out.println("New matrix");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
/*
 * Enter the row size
3
Enter the colomn size
3
Elements to the matrix
1 2 3
4 5 6
7 8 9

New matrix
7 4 1 
8 5 2 
9 6 3 

 * 
 * 
 */

	}

}
