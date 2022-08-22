package leetcoded9;

import java.util.Scanner;

public class Max_sum_of_Pair_with_Equal_sum_of_Digits {

	public static int digitSum(int a)
	{
		int sum=0;
		while(a>0)
		{
			sum+=(a%10);
			a/=10;
		}
		return sum;
	}
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		
		int arr[]=new int[size],i=0,j=0,temp=0,fin=0;
		System.out.println("Enter the elements to the array");
        for(i=0;i<size;i++)		
        {
        	arr[i]=scan.nextInt();
        }
        
        for(i=0;i<size;i++)
        {
        	temp=arr[i];
        	for(j=i+1;i<size-1&&j<size;j++)
        	{
        		if(digitSum(arr[i])==digitSum(arr[j]))
        		{
        			temp+=arr[j];
        		}
        	}
        	if(temp>fin)
        	{
        		fin=temp;
        	}
        }
        System.out.println("Output:"+fin);
       scan.close();
	}

}
