package leetcoded9;

import java.util.Scanner;

public class Decode_the_message {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
	    System.out.println("Enter the String");
	    String str=scan.nextLine();
	    
	    System.out.println("Enter the message");
	    String str1=scan.nextLine();
	    int i=0,j=0,k=0;
	    char arr[]=str.toCharArray();
	    int size=arr.length;
	   
	    for(i=0;i<size-1;i++)
	    {
	    	if(arr[i]==' ')
	    	{
	    		for(j=i;j<size-1;j++)
	    		{
	    			arr[j]=arr[j+1];
	    		}
	    		i--;size--;
	    	}
	    	for(j=i+1;j<size;j++)
	    	{
	    		if(arr[i]==arr[j])
	    		{
	    			for(k=j;k<size-1;k++)
	    			{
	    				arr[k]=arr[k+1];
	    			}
	    			j--;size--;
	    		}
	    	}
	    }
	   //vkbs bs t suepuv
	    System.out.println("The new message");
	    for(i=0;i<str1.length();i++)
	    {
	    	if(str1.charAt(i)==' ')
	    	{
	    		System.out.print(" ");continue;	
	    	}
	    	for(j=0;j<size;j++)
	    	{
	    		if(arr[j]==str1.charAt(i))
	    		{
	    			int temp=97+j;
	    			System.out.print((char)temp);break;
	    		}
	    		
	    	}
	    }
/*Decode the message
 * 
 * String :the quick brown fox jumps over the lazy dog
 * 
 * message:vkbs bs t suepuv
 *         |||| || | ||||||
 * Output: this is a secret
 * 
 * 
 * 
 * 
 * 
 * 	    
 */
	    	
		
		

	}

}
