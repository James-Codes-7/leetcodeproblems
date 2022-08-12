package leetcoded5;

import java.util.Scanner;

public class CountNumberUniqueDigits {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("Enter the number");
		int number=scan.nextInt(),sum=1;
		int i=0;
		while(i<number)
		{
			sum*=10;
			i++;
		}
		int temp=0,count=0,h=1;;
		count=sum>10?9:1;
		for(i=1;i<=sum;i++)
		{
			 temp=i;
			 
			while(temp>0)
			{
				h=temp%10;
				temp/=10;
				if(temp!=0&&h!=temp%10)
				{
					count++;
					break;
				}
			}
		}
		System.out.println("count:"+count);

	}
/*n=2;
sum=100;
count without 11,22,33,44,55,66,77,88,,99;
output:91;
*/
}
