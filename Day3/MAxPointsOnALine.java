package leetcoded3;

import java.util.Scanner;

public class MAxPointsOnALine {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the Points count");
		int count=scan.nextInt();
		
		int fisarr[]=new int[count],secarr[]=new int[count];
		int i=0,j=0,k=0,max=0;
		System.out.println("Enter the points");
		for(i=0;i<count;i++)
		{
			fisarr[i]=scan.nextInt();
			secarr[i]=scan.nextInt();
			
		}
		for(i=0;i<count;i++)
		{
			for(j=0;j<count;j++)
				
			{
				if(fisarr[i]==secarr[j])
				{
					if(fisarr[i]>max)
					{
						max=fisarr[i];
					}
				}
			}
		}
		System.out.println(max);
		
		
	}

}
