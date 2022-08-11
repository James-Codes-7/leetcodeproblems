package leetcoded4;

import java.util.Scanner;

public class ReverseTheVowels {

	public static boolean reverse(char b)
	{
		return b=='a'||b=='e'||b=='o'||b=='i'||b=='u';
	}
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
	 
		System.out.println("Enter the string");
		String rVowel=scan.next();
		char arr[]=rVowel.toCharArray();
		int i=0,j=0;
		
		for(i=0;i<rVowel.length()-1;i++)
		{
			if(reverse(rVowel.charAt(i)))
			{
				for(j=i+1;j<rVowel.length();j++)
				{
					if(reverse(rVowel.charAt(j)))
					{
						char t=arr[i];
						arr[i]=arr[j];
						arr[j]=t;
					
					}
				}
			}
		}
     rVowel=String.copyValueOf(arr);
     System.out.println(rVowel);
		

	}

}
