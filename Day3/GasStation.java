package leetcoded3;

import java.util.Scanner;

public class GasStation {

	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the total gas");
		int gas=scan.nextInt();

		int gasSta[]=new int[gas];

		int i=0,j=0,k=0;
		System.out.println("Enter the gasStation");
		for(i=0;i<gas;i++)
		{
			gasSta[i]=scan.nextInt();
		}

		System.out.println("Enter the totalnum of the cost");
		int cost=scan.nextInt();

		int costs[]=new int[cost];
		System.out.println("Enter the costs");
		for(i=0;i<cost;i++)
		{
			costs[i]=scan.nextInt();
		}
		int tank=0,c=0,s=0;
		for(i=0;i<gas;i++)
		{
			tank+=gasSta[i];
			if(i==gas-1)
				c=-1;
			else c=i;
			for(j=c+1;j<=gas;j++)
			{

				if(j==i)
					break;
				if(j>=gas)
				{
					j=gas-j;
					j--;
					continue;
				}
				if(j==0)tank=tank-costs[gas-1]+gasSta[j];
				else
					tank=tank-costs[j-1]+gasSta[j];
			}
			if(tank>0) { s=i;}
			tank=0;
		}
		System.out.println(s);
	}

}
