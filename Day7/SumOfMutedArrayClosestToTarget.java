package leetcoded7;

import java.util.Scanner;

public class SumOfMutedArrayClosestToTarget {

	static Scanner scan =new Scanner(System.in); 
	public static void main(String[] args) {

		System.out.println("Enter the array size");
		int size=scan.nextInt();

		int i=0,arr[]=new int[size],count=5,out=-1;
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the target");
		int k=scan.nextInt();
		for(i=0;i<size;i++)
		{
			int num=arr[i];
			while(num<k)
			{
				num+=arr[i];
			}
			int c=num<=k?num:(num-arr[i]);
			if(k-c<=count)
			{
				count=k-c;
				out=arr[i];
			}

		}
		System.out.println(out);
	}
/*size=4;
 * arr[2,3,5];
 * target=10;
 * output=5
 * 
 * 
 * 
 * 
 * 
 * 
 */

}
