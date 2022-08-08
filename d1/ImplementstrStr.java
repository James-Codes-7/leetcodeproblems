package leetcoded1;

import java.util.Scanner;

public class ImplementstrStr {
	static Scanner scan=new Scanner(System.in);
	public static int firstOcc(String str1,String str2)
	{
		int i=0,j=0,f=0;
		for(i=0;i<=str1.length()-str2.length();i++)
		{
			for(j=i;j<i+str2.length();j++)
			{
				f=1;
				if(str1.charAt(j)!=str2.charAt(j-i))
				{
					f=0;
					break;
				}
			}
			if(f==1) return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println("Enter the first string");
		String str1=scan.next();

		System.out.println("Enter the string");
		String str2=scan.next();

		int indexNo=firstOcc(str1,str2);
		System.out.println(indexNo);

       scan.close();


	}

}
