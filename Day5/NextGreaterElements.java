package leetcoded5;

import java.util.Scanner;

public class NextGreaterElements {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the first array size");
		int size=scan.nextInt();

		int arr[]=new int[size];
		int i=0,j=0;
		System.out.println("Enter the element to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();

		}

		System.out.println("Enter the size of Second Array");
		int size2=scan.nextInt();

		int arr2[]=new int[size2];
		System.out.println("Enter the elements to the second array");
		for(i=0;i<size2;i++)
		{
			arr2[i]=scan.nextInt();
		}
		int f=0;
		for(i=0;i<size;i++)
		{
			f=0;
			for(j=0;j<size2;j++)
			{
				if(arr[i]==arr2[j])
				{
					if(j<size2-1&&arr[i]<arr2[j+1])
					{
						f=1;
						System.out.print(arr2[j+1]+" ");
						break;
					}
					
				}
				
			}
			if(f==0)System.out.print(-1+" ");
		}
        

	}
/*size =3;
 * arr1[4,1,2]
 * size =4;
 * arr[1,3,4,2];
 * output:-1,3,-1;
 * 
 * 
 * 
 * 
 * 
 */

}
