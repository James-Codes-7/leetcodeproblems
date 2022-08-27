package leetcoded14;

import java.util.Scanner;

public class Count_Primes {

	 static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
	
	  System.out.println("Enter the number");
	  int number=scan.nextInt();
	  
	  int i=1,count=0;
	  while(i<=number)
	  {
		  int l=2,c=0;
		  while(l<=i/2)
		  {
			  if(i%l==0)
			  {
				  c++;
				  break;
			  }
			  l++;
		  }
			  if(c==0&&i!=1)
			  {
				  count++;
			  }
		 i++; 
	  }
	  System.out.println("Output:"+count);
	  
/*
 * Enter the number
10
Output:4
	  
 */

	}

}
