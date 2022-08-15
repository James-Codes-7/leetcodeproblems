package leetcoded7;

import java.util.Scanner;

public class FindLuckyIntegerInAnArray {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		
		int i=0,j=0,count=0,arr[]=new int[size],max=0,inter=0;
		
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		for(i=0;i<size;i++)
		{
			count=1;
			for(j=i+1;i<size-1&&j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>max)
			{
				max=count;
				inter=arr[i];
			}
		}
		System.out.println("The lucky number is:"+inter);
	
	}

}
