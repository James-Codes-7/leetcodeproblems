package leetcoded5;

import java.util.Scanner;

public class FizzBuzz {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the number");
		int number=scan.nextInt();

		int i=0;
		String arr[]=new String[number];
		for(i=0;i<number;i++)
		{
			arr[i]=Integer.toString(i+1);
		}
		for(i=0;i<number;i++)
		{
			int y=Integer.parseInt(arr[i]);
			if(y%3==0&&y%5==0)
			{
				arr[i]="FizzBuzz";
			}
			else if(y%3==0)
			{
				arr[i]="Fizz";
			}
			else if(y%5==0)
			{
				arr[i]="Buzz";
			}
			System.out.print(arr[i]+" ");
		}
	}

}
