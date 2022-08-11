package leetcoded4;

import java.util.Scanner;

public class KeybordRow {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		String keyboard[]= {"qwertyuiop","asdfghjkl","zxcvbnm"};
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		
		int i=0,j=0;
		String arr[]=new String[size];
		System.out.println("Enter the words to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.next();
		}
		for(i=0;i<size;i++)
		{
			for(j=0;j<keyboard.length;j++)
			{
				if(check(arr[i],keyboard[j]))
				{
					System.out.print("["+arr[i]+"]");
				}
			}
		}

	}
	public static boolean check(String str1,String str2)
	{
		int i=0,j=0,k=0;
		for(i=0;i<str1.length();i++)
		{
			for(j=0;j<str2.length();j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					k++;
					break;
				}
			}
		}
		if(k==str1.length())
		{
			return true;
		}
		return false;
	}

}
