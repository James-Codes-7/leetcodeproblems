package leetcoded1;

import java.util.Scanner;

public class AddBinary {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
	  System.out.println("Enter the first binary number");
	  int bin1=scan.nextInt();
	  
	  System.out.println("Enter the second binary number");
	  int bin2=scan.nextInt();
	  
	  int sum=0,remem=0,temp=0,p=1;
	  while(bin1>0&&bin2>0)
	  {
		  temp=(bin1%10+bin2%10)+remem;
		  sum+=(temp%2)*p;
		  p*=10;
		  if(temp/2==1) remem=temp/2;else remem=0;
		  bin1/=10;
		  bin2/=10;
		  
	  }
	  while(bin1>0)
	  {
		  temp=(bin1%10)+remem;
		   sum+=(temp%2)*p;
		   p*=10;
		   if(temp/2==1)remem=temp/2;else remem=0;
		   bin1/=10;
		  
	  }
	  while(bin2>0)
	  {
		  temp=(bin2%10)+remem;
		   sum+=(temp%2)*p;
		   p*=10;
		   if(temp/2==1)remem=temp/2;else remem=0;
		   bin2/=10;
		  
	  }
	  if(remem>0)
		  sum+=(remem*p);
	  
	  System.out.println(sum);
		

	}

}
