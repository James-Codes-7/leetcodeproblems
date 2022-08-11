package leetcoded4;

import java.util.Scanner;

public class IncreasingSubSequences {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the array size");
		int size=scan.nextInt();

		int arr[]=new int[size],i=0,j=0,k=0,s=0;
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}

		for(i=0;i<size-1;i++)
		{
			for(j=i+1;j<size;j++)
			{
				k=2;
				while(k<=size&&k>=2)
				{
					if(j<k&&j!=size-1)
					{
						if(arr[i]>arr[k-1]) return;
						System.out.print("[");
						System.out.print(arr[i]+" ");
						for(s=j;s<k;s++)
						{

						   System.out.print(arr[s]+" ");

						}
						System.out.print("]");
					}

					k++;
				}
			}
		}
	}

}
