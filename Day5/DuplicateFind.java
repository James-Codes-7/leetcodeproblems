package leetcoded5;

import java.util.Scanner;

public class DuplicateFind {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		

		System.out.println("Enter the size of the array");
		int size=scan.nextInt();
		
		int arr[]=new int[size],i=0,j=0;
		System.out.println("Enter the element to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(i=0;i<size-1;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("True");return;
				}
			}
		}
		System.out.println("False");
	}

}
