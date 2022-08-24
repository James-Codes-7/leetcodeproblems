package leetcoded10;

import java.util.Scanner;

public class Sum_Of_Even_Number_After_Queries {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the size");
		int size=scan.nextInt();
		
		int arr[]=new int[size],mat[][]=new int[size][2],i=0,j=0;
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Enter the quries and position to the matrix");
		for(i=0;i<size;i++)
		{
			for(j=0;j<2;j++)
			{
				mat[i][j]=scan.nextInt();
			}
		}
		int sum=0;
		for(i=0;i<size;i++)
		{
			sum=0;
			arr[mat[i][1]]+=mat[i][0];
			for(j=0;j<size;j++)
			{
				if(arr[j]%2==0)
				{
					sum+=arr[j];
				}
			}
			System.out.print(sum+" ");
		}
		
/*Enter the size
4
Enter the elements to the array
1 2 3 4
Enter the quries and position to the matrix
1 0
-3 1
-4 0
2 3
Output:
8 6 2 4 
 */
	}

}
