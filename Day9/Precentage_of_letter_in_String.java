package leetcoded9;

import java.util.Scanner;

public class Precentage_of_letter_in_String {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("Enter the string");
		String str=scan.nextLine();
		
		System.out.println("Enter the char to find the precentage");
		char a=scan.next().charAt(0);
		
		int i=0,count=0;
		
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==a)
			{
				count++;
			}
		}
		scan.close();
        float precentage=(float)count*(100/(float)str.length());
        System.out.println("The character Precentage:"+(int)precentage+"%");
	}
/*String =foolar
 * 
 * char=o
 * 
 * precentage=33%
 * 
 * 
 * 
 */

}
