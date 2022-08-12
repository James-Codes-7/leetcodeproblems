package leetcoded5;

import java.util.Scanner;

public class IntegerReplacement {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the integer");
		int integer=scan.nextInt();
		int count=0;
		while(integer!=1)
		{
			if(integer%2!=0)
			{
				integer++;
			}
			else
				integer/=2;
			count++;
		}
		System.out.println("Output:"+count);

	}
/*number=8;
 * 8/2=4 ,c=1;
 * 4/2=2,c=2;
 * 2/2=1,c=3;
 * output:3;
 * 
 * 
 * 
 * 
 */

}
