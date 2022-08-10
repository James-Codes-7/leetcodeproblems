package leetcoded3;

import java.util.Scanner;

public class PascalTriangle {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		int number=scan.nextInt();
		
		int i=0,j=0,t=1;
		for(i=1;i<=5;i++)
		{
			t=1;
			System.out.print("[");
			for(j=1;j<=i;j++)
			{
				System.out.print(t+",");
				t=t*(i-j)/j;
			}
			System.out.print("]");
		}
	}

}
