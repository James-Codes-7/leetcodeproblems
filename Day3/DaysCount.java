package leetcoded3;

import java.util.Scanner;

public class DaysCount {

	public static class Date
	{
		int day;
		int month;
		int year;
		
		Date(int d,int m,int y)
		{
			day=d;
			month=m;
			year=y;
		}
	}
	static Scanner scan=new Scanner(System.in);
	public static int leapcheck(Date d1)
	{
		int y=d1.year;
		if(d1.month<=2)
		{
			y--;
		}
		return y/4-y/100+y/400;
	}
	public static void main(String[] args) {
	
		System.out.println("Enter the first date");
		Date date1=new Date(scan.nextInt(),scan.nextInt(),scan.nextInt());
		
		System.out.println("Enter the second date");
		Date date2=new Date(scan.nextInt(),scan.nextInt(),scan.nextInt());
		
		int arr[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		int num1=0,num2=0,i=0,j=0;
		
		num1+=(365*date1.year)+date1.day;
		for(i=0;i<date1.month-1;i++)
		{
			num1+=arr[i];
		}
		num1+=leapcheck(date1);
		num2+=(365*date2.year)+date2.day;
		for(i=0;i<date2.month-1;i++)
		{
			num2+=arr[i];
		}
		num2+=leapcheck(date2);
		System.out.println(num2-num1);

	}

}
