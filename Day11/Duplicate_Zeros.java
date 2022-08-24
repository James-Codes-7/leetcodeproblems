package leetcoded11;

import java.util.Scanner;

public class Duplicate_Zeros {
 
	static  Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		
		int arr[]=new int[size*2],i=0,temp=size;
        System.out.println("Enter the elements to the array");
        for(i=0;i<temp;i++)
        {
        	arr[i]=scan.nextInt();
        	if(arr[i]==0)
        	{
        		temp++;
        		arr[i+1]=0;
        		i++;
        		
        	}
        }
        System.out.println("The new array");
        for(i=0;i<temp;i++)
        {
        	System.out.print(arr[i]+" ");
        }

	}
/*Enter the array size
7
Enter the elements to the array
0 3 0 4 0 2 2 
The new array
0 0 3 0 0 4 0 0 2 2 
 * 
 * 
 * 
 * 
 */

}
