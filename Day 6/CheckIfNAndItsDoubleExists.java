package leetcoded6;

import java.util.Scanner;

public class CheckIfNAndItsDoubleExists {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the size of the array");
		int size=scan.nextInt();

		int arr[]=new int[size];
		System.out.println("Enter the elements to the array");
		int i=0,j=0;
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(i=0;i<size;i++)
		{
			for(j=0;j<size;j++)
			{
				float b=arr[i];
				if(b/2==arr[j])
				{
					System.out.println((int)b/2);
					return;
				}
			}
		}

	}
/*size =4;
 * arr[10,2,3,5]
 * 
 * Output:5
 * 
 * 
 * 
 * 
 * 
 */

}
