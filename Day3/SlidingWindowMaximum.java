package leetcoded3;

import java.util.Scanner;

public class SlidingWindowMaximum {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		
		int i=0,j=0,k=0;
		int arr[]=new int[size];
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the key");
		int key=scan.nextInt();
		int max=0;
		for(i=0;i<=size-key;i++)
		{
			max=arr[i];
			for(j=i+1;j<i+key;j++)
			{
				if(max<arr[j])
				{
					max=arr[j];
				}
			}
			System.out.println(max);
		}

	}

}
