package leetcoded1;

import java.util.Scanner;

public class RomanToInt {

	static Scanner scan =new Scanner(System.in);
	public static int roman(char ch)
	{
		switch(ch)
		{
		case 'I':return 1;
		case 'V':return 5;
		case 'X':return 10;
		case 'L':return 50;
		case 'C':return 100;
		case 'D':return 500;
		case 'M':return 1000;
		}
		return -1;

	}
	public static void main(String[] args) {

		System.out.println("enter the String");
		String romInt=scan.next();

		int i=0,j=0,count=0,num1=0,num2=0,size=romInt.length();
		for(i=0;i<size;i++)
		{
			num1=roman(romInt.charAt(i));
			if(i<size-1)
			{
				num2=roman(romInt.charAt(i+1));
				if(num1>num2)
				{
					count+=num1;
				}
				else if(num1==num2) {count+=num1+num2;i++;}
				else if(num2>num1) {
					count+=(num2-num1);i++;}

			}
			else count+=num1;
		}
		System.out.println(count);

	}

}
