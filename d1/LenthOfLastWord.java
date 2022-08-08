package leetcoded1;

import java.util.Scanner;

public class LenthOfLastWord {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the string");
		String str=scan.nextLine();
		
		String arr[]=str.split(" ");
		
	       int length=arr[arr.length-1].length();
	       System.out.println(length);



	}

}
