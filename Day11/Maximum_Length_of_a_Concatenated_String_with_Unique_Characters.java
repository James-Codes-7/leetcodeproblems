package leetcoded11;

import java.util.Scanner;

public class Maximum_Length_of_a_Concatenated_String_with_Unique_Characters {

	static Scanner scan=new Scanner(System.in);
	public static  boolean charEquals(String a,String b)
	{
		int i=0,j=0;
		for(i=0;i<a.length();i++)
		{
			for(j=0;j<b.length();j++)
			{
				if(a.charAt(i)==b.charAt(j))
				{
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {

		System.out.println("Enter the string array size");
		int size=scan.nextInt();

		String arr[]=new String[size];
		int i=0,j=0,sum=0,max=0;

		System.out.println("Enter the elements to the String array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.next();
		}
		if(size==1) { System.out.println(arr[0].length());return;}
		for(i=0;i<size;i++)
		{
			sum=arr[i].length();
			for(j=i+1;j<arr.length;j++)
			{
				if(charEquals(arr[i],arr[j]))
				{

					sum+=(arr[j].length());
				}
				if(sum>=max)
				{
					max=sum;
					sum=arr[i].length();
				}
			}


		}
		System.out.println("Output:"+max);

	}
/*Enter the string array size
4
Enter the elements to the String array
cha r act ers
Output:6

 */

}
