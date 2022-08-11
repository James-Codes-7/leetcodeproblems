package leetcoded4;

import java.util.Scanner;

public class TopKFreaquencyWords {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		  System.out.println("Enter the string");
		  String sentance=scan.nextLine();
		  
		  String arr[]=sentance.split(" ");
		  
		  int i=0,j=0,c=1 ,count[]=new int[arr.length];
		  System.out.println("Enter the top size");
		  int k=scan.nextInt();
		  for(i=0;i<arr.length;i++)
		  {
			  c=1;
			  for(j=i+1;i<arr.length-1&&j<arr.length;j++)
			  {
				  if(arr[i].equals(arr[j]))
				  {
					  c++;
				  }
			  }
			  count[i]=c;
		  }
		  System.out.println("The top k Words");
		  for(i=0;i<arr.length;i++)
		  {
			  if(count[i]==k)
			  {
				  System.out.print(arr[i]+" ");
			  }
		  }
		  
		  

	}

}
