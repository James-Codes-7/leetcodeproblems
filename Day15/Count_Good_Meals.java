package leetcoded15;

import java.util.Scanner;

public class Count_Good_Meals {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the size");
		int size=scan.nextInt();
		
		int i=0,arr[]=new int[size],j=0;
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
			
		}
		int count=0;
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(powerCheck(arr[i]+arr[j]))
				{
					count++;
				}
			}
		}
		System.out.println("Output:"+count);
		
		
		

	}
 public static boolean powerCheck(int num)
 {
	 int i=1;
	 
	 while(i<=num/2)
	 {
		 if(num==Math.pow(2, i))
		 {
			 return true;
		 }
		 i++;
	 }
	 return false;
	 
 }

}
