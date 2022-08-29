package leetcoded15;

import java.util.Scanner;

public class Ugly_Number3 {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("Enter the a ,b and c");
		int a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt();
		
		System.out.println("Enter the target");
		int n=scan.nextInt();
		
		int max=0,temp=0;
		for(int i=1;;i++)
		{
			if(i%a==0||i%b==0||i%c==0)
			{
				max=i;
				temp++;
			}
			if(temp==n)
			{
				System.out.println("Output:"+max);return;
			}
			
		}
		

	}
/*
 * Enter the a ,b and c
   2 3 4
   Enter the target
   4
   Output:6


 */

}
