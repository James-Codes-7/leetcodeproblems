package leetcoded8;

import java.util.Scanner;

public class ReplaceAllTheDigitsWithCharactors {
	
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the String");
		String str=scan.next();
		
		int i=0;char arr[]=str.toCharArray();
		
		for(i=1;i<arr.length;i++)
		{
			if(arr[i]>='0'&&arr[i]<='9')
			{
				arr[i]= (char)(arr[i-1]+1);
			}
		}
		str=String.copyValueOf(arr);
		System.out.println(str);
		System.out.println(java.time.LocalDate.now());
	}
/*str=a1c1e1
 * 
 * Output:abcdef
 * 
 * 
 * 
 * 
 * 
 */
}
