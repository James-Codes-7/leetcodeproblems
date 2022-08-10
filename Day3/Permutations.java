package leetcoded3;

import java.util.Scanner;

public class Permutations {

	static Scanner scan=new Scanner(System.in);
	public static int[] swap(int[] arr,int s1,int s2)
	{
		int t=arr[s1];
		arr[s1]=arr[s2];
		arr[s2]=t;
		return arr;
	}
	public static void permutations(int[] arr,int l,int size) 
	{
		if(l==size)
		{
			System.out.print("[");
			for(int i=0;i<=size;i++) {System.out.print(arr[i]+" ");}
			System.out.print("]");
		}
		else
		{
			for(int j=l;j<=size;j++)
			{
				arr=swap(arr,l,j);
				permutations(arr,l+1,size);
				arr=swap(arr,l,j);
			}
		}
		return;
	}
	public static void main(String[] args) {


		System.out.println("Enter the array size");
		int size=scan.nextInt();

		int arr[]=new int[size];
		int i=0,j=0,k=0;
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		permutations(arr,0,size-1);

	}

}
