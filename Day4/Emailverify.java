package leetcoded4;

import java.util.Scanner;

public class Emailverify {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
     System.out.println("Enter the Email");
     String email=scan.next();
     
     System.out.println("Your mail is:"+email.endsWith("@gmail.com"));
	}

}
