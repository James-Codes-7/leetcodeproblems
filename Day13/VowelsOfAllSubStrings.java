package leetcoded13;

import java.util.Scanner;

public class VowelsOfAllSubStrings {

	static int count=0;
	 static  void vowelCheck(String s)
	 {
		 char arr[]=s.toCharArray();
		 for(int i=0;i<s.length();i++)
		 {
			 if(arr[i]=='a'||arr[i]=='e'||arr[i]=='o'||arr[i]=='i'||arr[i]=='u')
			 {
				 count++;
			 }
		 }
	 }
	static Scanner scan=new Scanner(System.in);
	public static void check(String str,int i,int y)
	{
		String s="";
		if(i==str.length())
		{
			return;
		}
		else
		{
			for(int j=y;j<=i;j++)
			{
				s+=str.charAt(j);
			}
			vowelCheck(s);
		}
		check(str,i+1,y);
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the String");
        String str=scan.nextLine();
        for(int i=0;i<str.length();i++)
        {
        	int y=i;
        	check(str,i,y);
        }
        System.out.println("Output:"+count);
	}
/*
 * Enter the String
aba
Output:6

 */
}
