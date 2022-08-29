package leetcoded15;

import java.util.Scanner;

public class Minimum_Increament_To_Make_The_Array_Unique {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		

		System.out.println("Enter the array size");
        int size=scan.nextInt();
        
        int arr[]=new int[size],i=0,j=0;
        System.out.println("Enter the elements to the array");
        for(i=0;i<size;i++)
        {
           arr[i]=scan.nextInt();
        }
        int count=0;
        for(j=0;j<size;j++)
        {
        	for(i=0;i<size;i++)
        	{
        		if(i!=j&&arr[j]==arr[i])
        		{
        			count++;
        			arr[j]++;
        			i=-1;
        			continue;
        		}
        	}
        }
        System.out.println("Output:"+count);
	}
/*
 * Enter the array size
   6
   Enter the elements to the array
   3 2 1 7 2 1
   Output:6

 */
}
