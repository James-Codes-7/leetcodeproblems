package leetcoded6;

import java.util.Scanner;

public class ReverseTheWordsInString {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
      System.out.println("Enter the String to reverse");
      String str=scan.nextLine();
      
      String dup="";
      int i=0,j=0;
      char arr[]=str.toCharArray();
      for(i=str.length()-1;i>=0;i--)
      {
    	  if(str.charAt(i)!=' '&&str.charAt(i)!=':')
    	  	  dup+=str.charAt(i);
      }
      System.out.println(dup);
      for(i=0;i<str.length();i++)
      {
    	  if(str.charAt(i)!=' '&&str.charAt(i)!=':')
    	  {
    		  arr[i]=dup.charAt(j);j++;
    		  
    	  }
      }
        System.out.println("The new String:"+String.copyValueOf(arr));
      
	}
/*String str=the reverse
 * 
 * Output:esr evereht
 * 
 * 
 * 
 * 
 */

}
