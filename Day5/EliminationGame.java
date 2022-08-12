package leetcoded5;

import java.util.Scanner;

public class EliminationGame {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the array size");
		int size=scan.nextInt();

		int i=0,j=0,k=0,arr[]=new int[size],s=0,m=0;
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}

		while(size!=1)
		{
			for(j=0;j<size;j++)
			{
				if(j%2==k)
				{
					arr[j]=-1;
				}
			}
			s=0;
			while(s<size)
			{
				if(arr[s]==-1)
				{
					for(m=s;m<size-1;m++)
					{
						arr[m]=arr[m+1];
					}
					size--;
					s--;
				}
				s++;
			}
			k++;
			k=k<=1?k:0;
		}
		System.out.println(arr[0]);

	}
/*
 * size =9;
 * arr[1,2,3,4,5,6,7,8,9];
 * arr[2,4,6,8];
 * arr[2,6];
 * arr[6];
 * output:6;
 * 
 * 
 * 
 * 
 */

}
