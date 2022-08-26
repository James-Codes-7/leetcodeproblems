package leetcoded13;

import java.util.Scanner;

public class Check_If_the_Sentence_Is_Panagram {

	static Scanner scan=new Scanner(System.in);
	public static void check(String s)
	{
		String temp="abcdefghijklmnopqrstuvwxyz";
		char arr[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(arr[i]>arr[j])
				{
					char t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		s=String.copyValueOf(arr);
		System.out.println("Output:"+temp.equals(s));
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		String str=scan.next();
		if(str.length()<26)
		{
			System.out.println("Output:false");
			return;
		}
		check(str);
	}

}
