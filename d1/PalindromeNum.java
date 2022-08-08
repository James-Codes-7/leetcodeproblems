package leetcoded1;

import java.util.Scanner;

public class PalindromeNum {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("enter the integer");
		int pNumber=scan.nextInt();

		int temp=0,rNumber=0;
		temp=pNumber;
		while(temp>0)
		{
          rNumber=(rNumber*10)+(temp%10);
          temp/=10;
		}
		if(pNumber==rNumber) System.out.println("true");
		else System.out.println("false");
			

	}

}
