package leetcoded12;

import java.util.Scanner;

public class Find_All_Lonely_Numbers {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		
		int arr[]=new int[size],i=0,j=0;
		
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		for(i=0;i<size;i++)
		{
			for(j=0;j<size;j++)
			{
				if(i!=j)
				{
					if(arr[j]==arr[i]+1||arr[j]==arr[i]-1||arr[j]==arr[i])
					{
						break;
					}
				}
			}
			if(j==size)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
	}
/*
 * Enter the array size
4
Enter the elements to the array
10 6 5 8
Output:
10 8 
 */

}
