package leetcoded3;

import java.util.Scanner;

public class ProductOfArrayExceptSelf {

	static Scanner scan =new Scanner(System.in); 
	public static void main(String[] args) {
		
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		
		int arr[]=new int[size],i=0,j=0,k=0;
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
	     int product=1;
	     System.out.print("[");
		for(i=0;i<size;i++)
		{
			for(j=0;j<size;j++)
			{
				if(i!=j)
				{
					product*=arr[j];
				}
			}
			System.out.print(product+" ");
		}
		System.out.print("]");
		

	}

}
