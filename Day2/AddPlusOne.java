package leetcoded2;

import java.util.Scanner;

public class AddPlusOne {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		

		System.out.println("Enter the array size");
		int size=scan.nextInt();
		
		int arr[]=new int[size],i=0,j=0,sum=0,p=1;
		int arr1[]=new int[size+1];
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		while(--size>=0)
		{
			sum+=(arr[size]*p);
					p*=10;
		}
		sum+=1;
		i=0;;
		while(sum>0)
		{
			arr1[i++]=sum%10;
			sum/=10;
		}
		for(j=i-1;j>=0;j--)
		{
			System.out.print(arr1[j]+" ");
		}
	}

}
