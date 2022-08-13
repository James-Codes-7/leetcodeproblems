package leetcoded6;

import java.util.Scanner;

public class NumberComplement {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("Enter the number");
		int number=scan.nextInt();
		
		int i=0,j=0,k=0,arr[]=new int[3],sum=0;
		while(number>0)
		{
			arr[i++]=number%2;
			number/=2;
			arr[i-1]=arr[i-1]==0?1:0;
		}
		for(j=i-1;j>=0;j--)
		{
			sum+=(arr[j]*Math.pow(2, k));
			k++;
		}
		System.out.println("Output:"+sum);
		

	}
/*number=5;
 * bin=101;
 * complement=010;
 * Output:2 
 */

}
