package leetcoded7;

import java.util.Scanner;

public class DeleteOperationForTwoStrings {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the  first String");
        String str1=scan.next();
        
        System.out.println("Enter the second String");
        String str2=scan.next();
        int i=0,j=0,n=0,count=0;
        
        for(i=0;i<str2.length();i++)
        {
        	n=0;
        	for(j=0;j<str1.length();j++)
        	{
        		if(str2.charAt(i)==str1.charAt(j))
        		{
        			n++;
        			count++;
        		}
        		if(n>1)
        		{
        			count--;
        			n--;
        		}
        	}
        }
        if(str1.length()==str2.length())
        {
        	System.out.println((str1.length()-count)*2);return;
        }
        System.out.println(str1.length()-count);
        
	}

}
