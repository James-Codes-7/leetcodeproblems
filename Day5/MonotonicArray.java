package leetcoded5;

import java.util.Scanner;

public class MonotonicArray {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		
		int i=0,j=0,arr[]=new int[size];
		
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		i=1;
		while(i<size-1)
		{
			if(arr[i]>=arr[i-1]&&arr[i+1]>=arr[i]) {}
			else if(arr[i]<=arr[i-1]&&arr[i+1]<=arr[i]) {}
			else
			{
				
				System.out.println("False");return;}
			i++;
		}
		System.out.println("True");
	}
/*size=4;
 * 
 * arr[1,2,3,4];
 * output:true;
 * arr[6,5,5,4];
 * output:true;
 * arr[1,3,2];
 * output:false;
 * 
 * 
 * 
 * 
 */
}
