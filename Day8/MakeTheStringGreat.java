package leetcoded8;

import java.util.Scanner;

public class MakeTheStringGreat {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the string");
		String str=scan.next();

		String temp="";
		char arr[]=str.toCharArray();
		int i=0;

		for(i=0;i<arr.length;i++)
		{
			if((i<arr.length-1)&&(arr[i]>='a'&&arr[i]<='z')&&(arr[i+1]>='A'&&arr[i+1]<='Z'))
			{
				i+=1;
				continue;
			}
			temp+=arr[i];
		}
		System.out.println(temp);

	}
/*String str=leAeetcode
 * 
 * OutPut=leetcode
 * 
 * 
 * 
 * 
 * 
 */
}
