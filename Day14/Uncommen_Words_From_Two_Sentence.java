package leetcoded14;

import java.util.Scanner;

public class Uncommen_Words_From_Two_Sentence {

	 static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
	
     System.out.println("Enter the first sentence");
     String str1=scan.nextLine();
     
     System.out.println("Enter the second sentence");
     String str2=scan.nextLine();
     
     String temp1[]=str1.split(" ");
     String temp2[]=str2.split(" ");
     int j=0,f=0;
     for(int i=0;i<temp1.length;i++)
     {f=0;
    	 for(j=0;j<temp2.length;j++)
    	 {
    		 if(temp1[i].equals(temp2[j]))
    		 {
    			 temp2[j]+='@';
    			 break;
    		 }
    	 }
    	 if(j==temp2.length&&i<temp1.length)
    	 {
    		 f=temp1.length;
    		 for(int k=i+1;k<f;i++)
    		 {
    			 if(temp1[i].equals(temp1[k]))
    			 {
    				 f=0;
    				 break; 
    			 }
    				
    		 }
    		if(f!=0) System.out.print(temp1[i]+" ");
    	 }
     }
     for(int i=0;i<temp2.length;i++)
     {
    	 if(temp2[i].endsWith("@"))
    	 {
    		 
    	 }
    	 else
    		 System.out.print(temp2[i]);
     }
	}

}
