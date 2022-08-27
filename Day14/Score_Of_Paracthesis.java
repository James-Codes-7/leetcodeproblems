package leetcoded14;

import java.util.Scanner;

public class Score_Of_Paracthesis {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		String str=scan.next();
		
		int f=0,i=0;
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
			{
				f++;
				
			}
			if(str.charAt(i)==')')
			{
				f--;
			}
		}
        if(f==0)
        {
        	System.out.println("Output:"+str.length()/2);
        }
	}

/*
 * Enter the String
   (())
   Output:2
 */
}
