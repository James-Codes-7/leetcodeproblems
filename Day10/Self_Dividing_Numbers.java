package leetcoded10;

import java.util.Scanner;

public class Self_Dividing_Numbers {
	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the left side number");
		int leftSide=scan.nextInt();

		System.out.println("Enter the right side number");
		int rightSide=scan.nextInt();

		int j=leftSide,f=0;
		while(leftSide<=rightSide)
		{
			int t=j%10;
			if(t==0||leftSide%t!=0)
			{
				f=1;
				j=0;
			}
			j/=10;
			if(f==0&&j==0)
			{
				f=0;
				System.out.println(leftSide);
				j=++leftSide;
			}
			if(j==0)
			{
				j=++leftSide;
				f=0;
			}
		}

	}

}
