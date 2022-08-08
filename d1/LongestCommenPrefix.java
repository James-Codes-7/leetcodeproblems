package leetcoded1;

import java.util.Scanner;

public class LongestCommenPrefix {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the size of String array");
		int size=scan.nextInt(),i=0,j=0,asize=-1,f=1;

		String arr[]=new String[size];
		System.out.println("Enter the elements to the String array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.next();
		}
		for(i=0;i<size;i++)
		{
			f=1;
			for(j=1;j<size;j++)
			{
				if(arr[0].charAt(i)!=arr[j].charAt(i))
				{
					f=0;
					break;
				}	
			}
			if(f==1) asize=i;else break;

		}
		if(asize!=-1)
		{
			for(i=0;i<=asize;i++)
			System.out.print(arr[0].charAt(i));
		}
		else System.out.println("No Prefix");
			


	}

}
