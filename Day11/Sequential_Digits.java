package leetcoded11;

import java.util.Scanner;

public class Sequential_Digits {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the start number");
		int start=scan.nextInt();
		
		System.out.println("Enter the end number");
		int end=scan.nextInt();
		
		int i=0,temp,che=0,r=0;
		System.out.println("Output:");
		for(i=start;i<=end;i++)
		{
			temp=i;
			r=temp%10;
			temp/=10;
			while(temp>0)
			{
				 che=temp%10;
			     if(che==r-1)
			     {
			    	 r=che;
			     }
			     else
			    	 break;
				temp/=10;
				
			}
			if(temp==0)System.out.print(i+" ");
				
		}
/*
 * Enter the start number
1000
Enter the end number
13000
Output:
1234 2345 3456 4567 5678 6789 12345 
 */
	}

}
