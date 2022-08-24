package leetcoded11;

import java.util.Scanner;

public class Print_Words_Vertically {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the string");
		String str=scan.nextLine();

		String arr[]=str.split(" ");

		int i=0,j=0,n=0,k=0,max=arr[0].length();
		for(i=1;i<arr.length;i++)
		{
			if(arr[i].length()>max) max=arr[i].length();
		}
		System.out.println("Output:");
		while(k<max)
		{
			i=0;
			while(i<arr.length)
			{
				char a[]=arr[i].toCharArray();
				j=n;
				while(j<a.length&&j<n+1)
				{
					System.out.print(a[j]);
					j++;
				}
				i++;
			}
			System.out.print(" ");
			n++;
			k++;
		}

	}
	/*
	 * Enter the string
CONTEST IS COMING             C O N T E S T
Output:                       I S
CIC OSO NM TI EN SG T         C O M I N G
	 */

}
