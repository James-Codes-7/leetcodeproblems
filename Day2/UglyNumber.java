package leetcoded2;

import java.util.Scanner;

public class UglyNumber {

	static Scanner scan=new Scanner(System.in);
	public static boolean primeCheck(int a)
	{
		int i=0,l=2,c=0;
		
			while(l<=a/2)
			{
				if(a%l==0)
				{
					c++;
					return false;
				}
			l++;
			}
		return true;	
		
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		int number=scan.nextInt();
		
		int l=2,mul=1;
		while(l<=number/2)
		{
			if(number%l==0&&l>5)
			{
				if(primeCheck(l))
				{
					System.out.println("False");return ;
				}
			}
			l++;
		}
		System.out.println("True");

	}

}
