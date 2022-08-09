package leetcoded2;

import java.util.Scanner;

public class FindFirstAndLastPosOfTheEmements {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		
		int arr[]=new int[size],i=0,j=0,k=0,firstOcc=-1,secondOcc=-1;
		
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter element to find");
		int target=scan.nextInt();
		
		for(i=0;i<size;i++)
		{
			if(arr[i]==target)
			{
				if(k==0) { firstOcc=i; k++;}
				else secondOcc=i;
			}
		}
		System.out.println("[ "+firstOcc+" "+secondOcc+" ]");
		
		
		
		

	}

}
