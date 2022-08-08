package leetcoded1;

import java.util.*;
public class TwoSum {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("enter the array size");
		int size=scan.nextInt();
		int arr[]=new int[size],i=0,j=0;
		System.out.println("enter the elements to the array");
		for(i=0;i<size;i++) {arr[i]=scan.nextInt();}
		System.out.println("enter the target");
		int target=scan.nextInt();
        for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println("["+i+","+j+"]");
					break;
				}
			}
		}
	}

}
