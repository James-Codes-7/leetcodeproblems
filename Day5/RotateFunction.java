package leetcoded5;

import java.util.Scanner;

public class RotateFunction {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the array size");
		int size=scan.nextInt();
		int arr[]=new int[size],i=0,j=0,s=0,sum=0,max=0;

		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}

         for(i=0;i<size;i++)
         {
        	 s=0;
        	 while(s<size)
        	 {
        		 sum+=(arr[s]*s);
        		 s++;
        	 }
        	 int p=arr[0];
        	 for(j=0;j<size-1;j++)
        	 {
        		 arr[j]=arr[j+1];
        	 }
        	 arr[j]=p;
        	 System.out.println(sum);
        	 if(sum>max)
        		 max=sum;
        	 sum=0;
        	 
         }
		System.out.println("Output:"+max);
	}
/*size=4;
 * arr[1,2,3,4]=20;
 * arr[2,3,4,1]=14;
 * arr[3,4,1,2]=12;
 * arr[4,1,2,3]=14;
 * output:20
 * 
 * 
 * 
 * 
 */
}
