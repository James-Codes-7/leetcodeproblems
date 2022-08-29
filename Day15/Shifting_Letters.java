package leetcoded15;

import java.util.Scanner;

public class Shifting_Letters {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the string");
		String str=scan.next();

		int arr[]=new int[str.length()],i=0,j=0;
		char st[]=str.toCharArray();
		System.out.println("Enter the shifting numbers");
		for(i=0;i<st.length;i++)
		{
			arr[i]=scan.nextInt();
		}

		for(i=0;i<st.length;i++)
		{
			for(j=0;j<=i;j++)
			{
				st[j]= (char) (st[j]+arr[i]);
			}
		}
		str=String.copyValueOf(st);
		System.out.println("Output:"+str);


	}
	/*
	 * Enter the string
   abc
   Enter the shifting numbers
   3 5 9
   Output:rpl
	 */

}
