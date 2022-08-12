package leetcoded5;

import java.util.Scanner;

public class PerfectNumber {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		int number=scan.nextInt();
		
		int i=0,sum=0;
		for(i=1;i<=number/2;i++)
		{
			if(number%i==0)
			{
				sum+=i;
			}
		}
		System.out.println("output:"+(sum==number));

	}

}
