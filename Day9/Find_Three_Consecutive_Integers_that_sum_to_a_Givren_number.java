package leetcoded9;

import java.util.Scanner;

public class Find_Three_Consecutive_Integers_that_sum_to_a_Givren_number {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		int number=scan.nextInt();
		
		int i=0,j=0,sum=0;
		for(i=1;i<=(number/2)-2;i++)
		{
			sum=0;
			for(j=i;j<i+3;j++)
			{
				sum+=j;
			}
			if(sum==number)
			{
				System.out.println("Three number:"+i+" "+(i+1)+" "+(i+2)); 
				break;
			}
		}

	}

}
