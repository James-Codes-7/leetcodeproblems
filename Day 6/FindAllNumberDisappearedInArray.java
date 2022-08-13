package leetcoded6;

import java.util.Scanner;

public class FindAllNumberDisappearedInArray {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("Enter the array size");
		int size=scan.nextInt();

		int arr[]=new int[size];
		int i=0,j=1,k=0;
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(i=0;i<size;i++)
		{
			int f=0;
		    for(j=0;j<size-1-i;j++)
		    {
		    	if(arr[j]>=arr[j+1])
		    	{
		    		f=1;
		    		int t=arr[j];
		    		arr[j]=arr[j+1];
		    		arr[j+1]=t;
		    	}
		    }
		    
		    if(f==0)
		    	{break;}
		}
		System.out.println();
		for(i=0;i<size-1;i++)
		{
			if(arr[i]+1==arr[i+1]||arr[i]==arr[i+1])
			{
				continue;
			}
			else
			{
				for(k=arr[i]+1;k<arr[i+1];k++)
				{
					System.out.print(k+" ");
				}
			}
		}
	}
/*size=8;
 * arr[4,3,2,7,8,3,2,1];
 * output:5 6
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
}
