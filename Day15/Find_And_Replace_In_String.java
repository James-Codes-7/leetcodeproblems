package leetcoded15;

import java.util.Scanner;

public class Find_And_Replace_In_String {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the String");
		String str=scan.next();

		System.out.println("Enter the indeces size");
		int size=scan.nextInt();
		int ind[]=new int[size],i=0;
		System.out.println("Enter the indices");
		for(i=0;i<size;i++)
		{
			ind[i]=scan.nextInt();
		}
		//	scan.nextLine();
		System.out.println("Enter the sources");
		String sour[]=new String[size];
		for(i=0;i<size;i++)
		{
			sour[i]=scan.next();
		}
		System.out.println("Enter the targets ");
		String target[]=new String[size];
		for(i=0;i<size;i++)
		{
			target[i]=scan.next();
		}
		System.out.println();
		int k=0;
		System.out.print("Output:");
		String map=str;
	    for(k=0;k<size;k++)
	    {
	    	if(map.contains(sour[k]))
	    	{
	    		 if(k<size-1)
		    	 {
		    		 map=map.substring(ind[k+1]);
		    	 }
	    	 str=str.replace(sour[k],target[k]);
	    	
	    	}
	    	
	    }
	    System.out.print(str);
	}
}
