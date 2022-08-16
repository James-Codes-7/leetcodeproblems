package leetcoded8;

import java.util.Scanner;

public class MaximumAscendingSubArraySum {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		
		int i=0,j=0,arr[]=new int[size],sum=0,max=0;
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}

		for(i=0;i<size;i++)
		{
			sum=arr[i];
			for(j=i;j<size-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					sum+=arr[j+1];
					
				}
				else  break;
			}
			i=j;
			if(sum>max)
			{
				max=sum;
			}
			
		}
		System.out.println("Output:"+sum);
	}
/*size =6;
 * 
 * arr[10,20,30,5,10,50]
 * 
 * Output:65
 * 
 * 
 * 
 * 
 * 
 *
 */
}
