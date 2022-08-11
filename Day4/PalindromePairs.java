package leetcoded4;

import java.util.Scanner;

public class PalindromePairs {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the total count");
		int size=scan.nextInt();
		int i=0,j=0;
		String arr[]=new String[size];
		System.out.println("Enter the string array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.next();
		}
		for(i=0;i<size;i++)
		{
			for(j=0;j<size;j++)
			{
				if(i!=j)
				{
					if(check(arr[i].concat(arr[j])))
					{
						System.out.print("["+i+" "+j+"]");
					}
				}
			}
		}
		 

	}
  public static boolean check(String str)
  {
	  int i=0;
	  for(i=0;i<str.length()/2;i++)
	  {
		  if(str.charAt(i)!=str.charAt(str.length()-1-i))
		  {
			  return false;
		  }
	  }
	  return true;
  }
}
