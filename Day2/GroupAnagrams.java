package leetcoded2;

import java.util.Scanner;

public class GroupAnagrams {

	static Scanner scan=new Scanner(System.in);
	public static boolean anaCheck(String str1,String str2)
	{
		int i=0,j=0,k=0;
		if(str1.length()!=str2.length()) return false;
		for(i=0;i<str1.length();i++)
		{
			for(j=0;j<str2.length();j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					k++;
					break;
				}
			}
		}
		if(k==i) return true;
		return false;
	}
	public static void main(String[] args) {

		System.out.println("Enter the size of the array");
		int size=scan.nextInt();

		String arr[]=new String[size];
		int i=0,j=0,k=0,m1=0,m2=0;
		System.out.println("Enter the elements to the String Array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.next();
		}
		String mat[][]=new String[3][3];
		for(i=0;i<size;i++)
		{
			mat[m1][m2++]=arr[i];
			for(j=i+1;i<size-1&&j<size;j++)
			{
				if(anaCheck(arr[i],arr[j]))
				{
					mat[m1][m2++]=arr[j];
					for(k=j;k<size-1;k++)
					{
						arr[k]=arr[k+1];
					}
					size--;j--;
				}
			}
			m1++;
			m2=0;
		}
		for(i=0;i<mat.length;i++)
		{
			System.out.print("[");
			for(j=0;j<mat[i].length;j++)
			{
				if(mat[i][j]!=null)
				{
					System.out.print(mat[i][j]+",");
				}
			}
			System.out.println("]");
			System.out.println();
		}

	}

}
