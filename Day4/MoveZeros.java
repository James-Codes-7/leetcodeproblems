package leetcoded4;

import java.util.Scanner;

public class MoveZeros {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the array size");
		int size=scan.nextInt();

		int arr[]=new int[size];
		int i=0,k=0;
	    int count=size;
	    k=size-1;
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
			if(arr[i]==0)
			{
				arr[k--]=arr[i];i--;size--;
				
			}
		}
		System.out.println("The new array");
		for(i=0;i<count;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
