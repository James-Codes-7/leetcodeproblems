package leetcoded8;

import java.util.Scanner;

public class SumOfUniqueElements {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		
		int arr[]=new int[size],i=0,j=0,sum=0;
		
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		for(i=0;i<size;i++)
		{
			for(j=i+1;i<size-1&&j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=0;
					break;
				}
			}
			if(j==size)
			{
				sum+=arr[i];
			}
		}
		System.out.println("Output:"+sum);
		
	}

}
