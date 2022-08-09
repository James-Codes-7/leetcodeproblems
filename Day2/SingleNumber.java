package leetcoded2;

import java.util.Scanner;

public class SingleNumber {

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
		for(i=0;i<size;i++)
		{
			for(j=0;j<size;j++)
			{
				if(i!=j&&arr[i]==arr[j])
				{
					break;
				}
			}
			if(j==size)
			{
				System.out.println(arr[i]);
				break;
			}
		}
		

	}

}
