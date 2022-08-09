package leetcoded2;

import java.util.Scanner;

public class CombinationSum {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the array size");
		int size=scan.nextInt();

		int arr[]=new int[size],i=0,j=0,temp=0,k=0,extra=0;

		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}

		System.out.println("Enter the target");
		int target=scan.nextInt(),f=0;;

		for(i=0;i<size;i++)
		{
			if(target%arr[i]>0)
			{
				temp=target/arr[i];
				extra=target%arr[i];
				for(j=0;j<size;j++)
				{
					f=0;
					if(i!=j&&arr[j]==extra)
					{
						f=1;
						j=arr[j];break;
					}
					else if(i!=j&&arr[j]==extra+arr[i])
					{
						temp--;
						f=1;
						j=arr[j]; break;
					}
				}
				if(f==1) {
					System.out.print("[");
					for(k=0;k<temp;k++)
					{
						System.out.print(arr[i]+" ");
					}
					System.out.print(j+"]");
				}
			}
			 if(target%arr[i]==0)
			{
				System.out.print("[");
			for(k=0;k<target/arr[i];k++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.print("]");
			}
		}



	}

}

