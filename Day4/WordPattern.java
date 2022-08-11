package leetcoded4;

import java.util.Scanner;

public class WordPattern {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		String start=scan.next();
		
		String[] sArr=new String[start.length()];
		int i=0,j=0;
		System.out.println("Enter the string array");
		for(i=0;i<start.length();i++)
		{
			sArr[i]=scan.next();
		}
		for(i=0;i<start.length()-1;i++)
		{
			for(j=i+1;j<start.length();j++)
			{
				if(start.charAt(i)==start.charAt(j))
				{
					if(!sArr[i].equals(sArr[j]))
					{
						System.out.println("False"); return;
					}
				}
			}
		}
		System.out.println("True");

	}

}
