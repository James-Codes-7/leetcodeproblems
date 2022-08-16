package leetcoded8;

import java.util.Scanner;

public class LongerContiguousSegmentsOfOnesThanZero {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("Enter the String");
		String str=scan.next();
        
		int i=0,j=0,count1=1,max1=0,max2=0;
		
		while(i<str.length()-1)
		{
			count1=1;
		    for(j=i+1;j<str.length();j++)
		    {
		    	if(str.charAt(i)!=str.charAt(j))
		    		break;
		    	count1++;
		    }
		    if(str.charAt(i)=='1')
		    {
		    	if(count1>=max1)
		    	{
		    		max1=count1;
		    	}
		    }
		    if(str.charAt(i)=='0')
		    {
		    	if(count1>=max2)
		    	{
		    		max2=count1;
		    	}
		    }
		    i++;
		}
		
		System.out.println(max1>max2);

	}
/*
 * Str=1101
 * 
 * Output:true
 * 
 * 
 * 
 */

}
