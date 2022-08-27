package leetcoded14;

import java.util.Scanner;

public class Prime_Palindrome {

	static Scanner scan=new Scanner(System.in);
	public static boolean palindromeCheck(int num)
	{
		int temp=0,ori=num;
		while(num>0)
		{
			temp=(temp*10)+(num%10);
					num/=10;
		}
		return temp==ori;
		
		
	}
	public static boolean primeCheck(int num)
	{
		int l=2,c=0;
		if(num==1)
			return false;
		while(l<=num/2)
		{
			if(num%l==0)
			{
				c++;
				break;
			}
			l++;
		}
		return c==0;
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		int number=scan.nextInt();
		
		boolean bool=true;
		number++;
		while(bool)
		{
			if(primeCheck(number)&&palindromeCheck(number))
			{
				System.out.println("Output:"+number);bool=false;
				return;
			}
			number++;
		}

	}

}
