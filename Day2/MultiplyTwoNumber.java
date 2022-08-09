package leetcoded2;

import java.util.Scanner;

public class MultiplyTwoNumber {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("Enter the first number");
		int first=scan.nextInt();
		
		System.out.println("Enter the second number");
		int second=scan.nextInt();
		
		int sum=0,total=0,p=1;
		while(second>0)
		{
			sum=(second%10)*p;
			p*=10;
			total+=(sum*first);
			second/=10;
		}
         System.out.println(total);
	}

}
