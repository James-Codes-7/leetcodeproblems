package leetcoded2;

import java.util.Scanner;

public class SimplyfyNumber {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		int number=scan.nextInt(),sum=0;
		
		while(number>0||sum>9)
		{
			if(number==0)
			{
				number=sum;
				sum=0;
			}
			sum+=(number%10);
			number/=10;
		}
		System.out.println(sum);
	}
}
