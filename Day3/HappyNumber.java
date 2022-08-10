package leetcoded3;

import java.util.Scanner;

public class HappyNumber {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		int num=scan.nextInt();
		int temp=0,sum=0,pow;
		temp=num;
		while(num>0||sum>9)
		{
			if(num==0)
			{
				num=sum;
				sum=0;
			}
			pow=num%10;
			sum+=(pow*pow);
			num/=10;
		}
		System.out.println(sum==1);

	}

}
