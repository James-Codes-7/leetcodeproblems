
package leetcoded7;

import java.util.Scanner;

public class SetMismatch {

	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		
		int i=0,arr[]=new int[size];
		System.out.println("Enter the array elements");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		for(i=0;i<size-1;i++)
		{
		     if(arr[i]+1!=arr[i+1])
		     {
		    	 System.out.println(arr[i]+" "+(arr[i]+1));
		    	 break;
		    	 
		     }
		}
	
		

	}

}
