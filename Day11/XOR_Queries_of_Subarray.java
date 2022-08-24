package leetcoded11;

import java.util.Scanner;

public class XOR_Queries_of_Subarray {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		
		int arr[]=new int[size],i=0,j=0,sum=0,mat[][]=new int[size][2];
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Enter the queries");
		for(i=0;i<size;i++)
		{
			for(j=0;j<2;j++)
			{
				mat[i][j]=scan.nextInt();
			}
		}
		
		for(i=0;i<size;i++)
		{
			sum=0;
			int start=mat[i][0];
			int end=mat[i][1];
			for(j=start;j<=end;j++)
			{
				sum^=arr[j];
			}
			System.out.print(sum+" ");
		} 
/*
 * Enter the array size
5
Enter the elements to the array
1 2 3 4 5
Enter the queries
0 2
1 4
0 2
2 4
3 4
Output:
0 0 0 2 1 		
 */
		
	}

}
