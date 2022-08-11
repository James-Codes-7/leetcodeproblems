package leetcoded4;

import java.util.Scanner;

public class SortestUnsortedContinuesSubArray {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		
		int arr[]=new int[size],i=0,j=0,k=0;
		System.out.println("Enter the element to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(i=0;i<size-1;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
					k=j;
				}
			}
		}
		System.out.println("Output:"+k);
		

	}

}
