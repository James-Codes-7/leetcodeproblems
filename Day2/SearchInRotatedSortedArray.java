package leetcoded2;

import java.util.Scanner;

public class SearchInRotatedSortedArray {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the array size");
		int size=scan.nextInt();

		int arr[]=new int[size],i=0,j=0,k=0;
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the rotate position");
		int rotatepos=scan.nextInt();

		for(i=0;i<rotatepos;i++)
		{
			j=arr[0];
			for(k=0;k<size-1;k++)
			{
				arr[k]=arr[k+1];
			}
			arr[k]=j;
		}
		System.out.println("Enter the target");
		int target=scan.nextInt();
		for(i=0;i<size;i++)
		{
			if(arr[i]==target) {System.out.println(i);return;}
		}
		System.out.println(-1);



	}

}
