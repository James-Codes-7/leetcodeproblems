package leetcoded3;

import java.util.Scanner;

public class BestTimeToBuySellStock {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Total days");
		int days=scan.nextInt();
		
		int arr[]=new int[days];
		
		int max=0,i=0,s=0,j=0;
		System.out.println("Enter the price");
		for(i=0;i<days;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(i=1;i<days;i++)
		{
			if(arr[i]>arr[i-1]&&arr[i]-arr[i-1]>max)
			{
				max=arr[i];
				s=i;
			}
		}
		System.out.println(max);
	}

}
