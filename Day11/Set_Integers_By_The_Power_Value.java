package leetcoded11;

import java.util.Scanner;

public class Set_Integers_By_The_Power_Value {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the left");
		int left=scan.nextInt();

		System.out.println("Enter the right");
		int right=scan.nextInt();

		System.out.println("Enter the target");
		int target=scan.nextInt();

		int arr1[]=new int[right-left+1];
		int[] temp=new int[right-left+1];
		int i=0,j=left,k=0;;
		for(i=left;i<=right;i++)
		{
			int count=0;
			while(i!=1)
			{
				if(i%2==0)
				i/=2;	
				else
					i=3*i+1;
				count++;
			}

			i=arr1[k]=j++;
			temp[k]=count;
			k++;
		}
		for(i=0;i<k;i++)
		{
			for(j=i+1;i<k-1&&j<k;j++)
			{
				if(temp[i]>temp[j])
				{
					int t=arr1[i];
					int t1=temp[i];
					arr1[i]=arr1[j];
					temp[i]=temp[j];
					arr1[j]=t;
					temp[j]=t1;

				}
			}
		}

		System.out.println("Output:"+arr1[target-1]);

	}
/*
 * Enter the left
7
Enter the right
11
Enter the target
4
Output:7

 */

}
