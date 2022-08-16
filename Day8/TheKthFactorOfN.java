package leetcoded8;

import java.util.Scanner;

public class TheKthFactorOfN {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		int number=scan.nextInt();
		
		System.out.println("Enter the k");
		int k=scan.nextInt();
		
		int c=0,l=1;
		while(l<=number)
		{
			
			if(number%l==0)
			{
				c++;
			}
			if(c==k)
			{
				System.out.println("Output:"+l);
				return;
			}
			l++;
		}
		

	}
/*number=7;
 * factor=1,7;
 * k=2;
 * Output:7
 * 
 * 
 * 
 * 
 * 
 * 
 */

}
