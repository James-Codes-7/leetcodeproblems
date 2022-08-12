package leetcoded5;

import java.util.Scanner;

public class FindTheFIrstUniqueCharactor {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		String str=scan.next();
		
		int i=0,j=0;
		for(i=0;i<str.length();i++)
		{
			for(j=0;j<str.length();j++)
			{
				if(i!=j&&str.charAt(i)==str.charAt(j))
				{
					break;
				}
			}
			if(j==str.length())
			{
				System.out.println("output"+i);
				break;
			}
		}

	}

}
