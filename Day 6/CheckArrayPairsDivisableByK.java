package leetcoded6;

import java.util.Scanner;

public class CheckArrayPairsDivisableByK {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		
		int arr[]=new int[size],i=0;
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
			
		}
		System.out.println("Enter the k");
		int k=scan.nextInt();
		for(i=0;i<size/2;i++)
		{
			if((arr[i]+arr[size-1-i])%k!=0)
			{
				System.out.println("False");return;
			}
			
		}
		System.out.println("True");

	}
/*size=10
 *  arr[1,2,3,4,5,10,6,7,8,9]
 *  
 *  Output:true
 * 
 * 
 * 
 * 
 * 
 * 
 */
}
