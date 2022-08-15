package leetcoded7;

import java.util.Scanner;

public class FindNumbersWithEvenNumberOfDigits {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		
		int i=0,count=0,arr[]=new int[size];
		
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		for(i=0;i<size;i++)
		{ 
			count=0;
			int num=arr[i];
			while(num>0)
			{
				count++;
				num/=10;
			}
			if(count%2==0)
			{
				System.out.println(arr[i]);
			}
		}

	}
/*size=4;
 * arr[33,4,567,4532]
 * 
 * output:33 4532
 * 
 * 
 * 
 * 
 */

}
