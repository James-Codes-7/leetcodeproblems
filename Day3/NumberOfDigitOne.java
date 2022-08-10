package leetcoded3;

import java.util.Scanner;

public class NumberOfDigitOne {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the number");
		int number=scan.nextInt();

		int i=1,temp=i,count=0;
		while(i<=number)
		{

			if(temp%10==1)
			{
				count++;	
			}
			temp/=10;
			if(temp==0) 
			{
				temp=++i;
			}

		}
		System.out.println(count);

	}

}
