package leetcoded1;

import java.util.Scanner;

public class RemoveDuplicate {

	static Scanner scan=new Scanner(System.in);
	public static int check(int arr[],int size)
	{
		int j=0,i=0,k=0;
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					for(k=j;k<size-1;k++)
					{
						arr[k]=arr[k+1];
					}
					size--;j--;
				}
			}
		}

		return size;
	}
	public static void main(String[] args) {

		System.out.println("enter the array size");
		int size=scan.nextInt();

		int arr[]=new int[size],i=0,j=0,k=0;
		System.out.println("enter the elements to the array");
		for(i=0;i<size;i++) arr[i]=scan.nextInt();
		size=check(arr, size);
		System.out.println("The new sorted array");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}


	}

}
