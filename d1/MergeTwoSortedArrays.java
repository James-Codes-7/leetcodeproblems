package leetcoded1;

import java.util.Scanner;

public class MergeTwoSortedArrays {
	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("enter the first array size");
		int size1=scan.nextInt();

		int arr1[]=new int[size1],i=0,j=0;
		System.out.println("Enter the elements to the array");
		for(i=0;i<size1;i++) {arr1[i]=scan.nextInt();}

		System.out.println("enter the second array size");
		int size2=scan.nextInt();
		int arr2[]=new int[size2];
		System.out.println("enter the elemesnts to the array");
		for(i=0;i<size2;i++) arr2[i]=scan.nextInt();

		int r=size1<size2?size2:size1;
		System.out.print("[ ");
		for(i=0;i<r;i++)
		{

			if(size1>0&&size2>0)
			{
				System.out.print(arr1[i]+" "+arr2[i]+" ");size1--;size2--;
			}
			else if(size1>0) {System.out.print(" "+arr1[i]);size1--;}
			else if(size2>0) {System.out.print(" "+arr2[i]);size2--;}
		}
		System.out.print(" ]");

	}

}
