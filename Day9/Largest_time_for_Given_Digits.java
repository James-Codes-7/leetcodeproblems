package leetcoded9;

import java.util.Arrays;
import java.util.Scanner;

public class Largest_time_for_Given_Digits {

	public static int timecheck(int a[],int b)
	{
		int i=0,j=0,max=0;
		
		for(i=0;i<a.length;i++)
		{
			if(max<a[i]&&a[i]<b)
			{
				max=a[i];
				j=i;
				
			}
		}
		a[j]=20;
		
		return max;
	}
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
	
		int i=0,arr[]=new int[4],count =0;
		System.out.println("Enter the number for time");
		for(i=0;i<4;i++)
		{
			arr[i]=scan.nextInt();
			if(arr[i]>4)
			{
				count++;
			}
		}
		if(count>2)
			return;
		Arrays.sort(arr);
		System.out.println();
	
			int temp=timecheck(arr,3);
			System.out.print(temp);
			if(temp==2)
			{
			System.out.print(timecheck(arr, 4));
			}
			else
			{
				System.out.print(timecheck(arr, 10));
			}
			System.out.print(":");
			System.out.print(timecheck(arr,6));
			System.out.print(timecheck(arr,10));
			
		

	}

}
