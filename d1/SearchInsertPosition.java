package leetcoded1;

import java.util.Scanner;

public class SearchInsertPosition {
        static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		
		int arr[]=new int[size],i=0,j=0;
		
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Enter the target ");
		int target=scan.nextInt();
		
		for(i=0;i<size;i++)
		{
			if(arr[i]==target)
				{System.out.println("Index of "+target+" is:"+i);return ;}
		}
		System.out.println(-1);

	}

}
