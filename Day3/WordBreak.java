package leetcoded3;

import java.util.Scanner;

public class WordBreak {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("Enter the String");
		String main=scan.next();
		
		System.out.println("Enter the wordDict count");
		int size=scan.nextInt();
		
		String arr[]=new String[size];
		int i=0,j=0,k=0;
		System.out.println("Enter the elements");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.next();
			System.out.println(arr[i].length());
		}
		int f=0;
		for(i=0;i<main.length();i++)
		{
			for(j=i;j<i+arr[k].length();j++)
			{
				f=1;
				if(main.charAt(j)!=arr[k].charAt(j-i))
				{
					f=0;
					break;
				}
			}
			if(f==0)
			{
				System.out.println("False");
				return;
			}
			i=j-1;
			
			k++;
			if(k==size)break;
		}
		System.out.println("True");
		

	}

}
