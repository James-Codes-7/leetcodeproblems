package leetcoded14;

import java.util.Scanner;

public class Length_Of_Longest_Fibonaci_Sequence {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
       System.out.println("Enter the array size");
       int size=scan.nextInt();
       
       int arr[]=new int[size],i=0,j=0,max=0,count=1,k=0;
       System.out.println("Enter the elements to the array");
       for(i=0;i<size;i++)
       {
    	   arr[i]=scan.nextInt();
       }
       for(i=0;i<size-2;i++)
       {
    	   for(j=i+1;j<size-1;j++)
    	   {
    		   int temp=arr[i]+arr[j];
    		   int dub=arr[j];
    		   count=2;
    		   for(k=j+1;k<size;k++)
    		   {
    			  if(temp==arr[k])
    			  {
    				  count++;
    				  temp=temp+dub;
    				  dub=arr[k];
    			  }
    		   }
    		   if(count>=max)
    		   {
    			   max=count;
    		   }
    	   }
       }
       System.out.println("Output:"+max);
	}
/*
 * Enter the array size
8
Enter the elements to the array
1 2 3 4 5 6 7 8
Output:5

 */
}
