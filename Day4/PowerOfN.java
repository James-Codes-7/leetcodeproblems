package leetcoded4;

import java.util.Scanner;

public class PowerOfN {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the number");
		int number=scan.nextInt();

		System.out.println("Enter the Powe");
		int pow=scan.nextInt();
		while(number>0)
		{
			if(number/pow==pow)
			{
				System.out.println("True");
				return;
			}
			number/=pow;

		}
		System.out.println("False");
	}

}
