package leetcoded1;

import java.util.Scanner;

public class InvalidParanthesis {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
	   System.out.println("enter the paranthesis");
	   String parath=scan.next();
	   char temp[]=parath.toCharArray();
	   int i=0,p1=0,p2=0,p3=0;
	   for(i=0;i<parath.length();i++)
	   {
		   if(temp[i]=='(') p1++;if(temp[i]==')') p1--;
		   if(temp[i]=='{') p2++;if(temp[i]=='}') p2--;
		   if(temp[i]=='[') p3++;if(temp[i]==']') p3--;
	   }
	   if(p1==0&&p2==0&&p3==0)
		   System.out.println("True");
	   else System.out.println("False");

	}

}
