package leetcoded2;

import java.util.Scanner;

public class ThreeSum {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the array Size");
		int size=scan.nextInt();
		
		int arr[]=new int[size];
		int i=0,j=0,k=0;
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		for(i=0;i<size-2;i++)
		{
			for(j=i+1;j<size-1;j++)
			{
				for(k=j+1;k<size;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						System.out.println("["+arr[i]+" "+arr[j]+" "+arr[k]+"]");
					}
				}
			}
		}
	}

}
