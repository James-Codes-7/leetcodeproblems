package leetcoded6;

import java.util.Scanner;

public class MaxConsecutiveOnes {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		
		int i=0,max=0,count=1,arr[]=new int[size];
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
			if(i>=1)
			{
				if(arr[i]==arr[i-1])count++;
				else if(count>max)
				{
					max=count;
					count=1;
				}
			}
		}
		System.out.println("Output:"+count);
		

	}
/*size =6;
 * 
 * arr[1,1,0,1,1,1]
 * 
 * Output:3
 * 
 * 
 * 
 * 
 * 
 */

}
