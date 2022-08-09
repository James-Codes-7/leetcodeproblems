package leetcoded2;

import java.util.Scanner;


public class LongestPalindromicSubstring {

	static Scanner scan =new Scanner(System.in);
	public static boolean find(String str)
	{
		int x=str.length()-1;
		int i=0;
		
		for( i=0;i<str.length()/2;i++)
		{
			
			if(str.charAt(i)!=str.charAt(x-i))
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {

		System.out.println("Enter the string");
		String str=scan.next(),str1="";
		int i=0,j=0,k=2,y=-1,m=-1;
	//	System.out.println(str.substring(1, 5));
		for(int x=0;x<str.length();x++)
		{
			for(i=0;i<=str.length()-k;i++)
			{
				
				if(find(str.substring(i, i+k)))
				{
				
                 str1=str.substring(i, i+k);
				}

			}
			k++;
		}
		System.out.println(str1);

	}

}
