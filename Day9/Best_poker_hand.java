package leetcoded9;

import java.util.Scanner;

public class Best_poker_hand {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		
		int rank[]=new int[size],i=0,j=0;
        System.out.println("Enter the element to the array");
        for(i=0;i<size;i++)
        {
        	rank[i]=scan.nextInt();
        }
        
        System.out.println("Enter the character array size");
        int size1=scan.nextInt();
        
        char suits[]=new char[size1];
        System.out.println("Enter the character to the array");
        for(i=0;i<size1;i++)
        {
        	suits[i]=scan.next().charAt(0);
        	
        }
        scan.close();
        for(i=0;i<suits.length;)
        {
        	for(j=i+1;j<suits.length;j++)
        	{
        		if(suits[i]!=suits[j])
        			break;
        	}
        	if(j==suits.length)
        	{
        		System.out.println("Flush");return;
        	}
        	else
        		break;
        }
        int count=1;
        for(i=0;i<rank.length;i++)
        {
        	count=1;
        	for(j=i+1;j<rank.length;j++)
        	{
        		if(rank[i]==rank[j])
        		{
        			count++;
        		}
        	}
        	if(count>2)
        	{
        		System.out.println("Three of kind");
        		return;
        	}
        	if(count==2)
        	{
        		System.out.println("Pair");return;
        	}
        }
	}
 /*it is a game
  * 
  * rank[1,2,3,4,5]  suits['a','a','a','a','a']
  * if all the character of suits is same print Flush
  * 
  * rank[2,1,3,1,1]  suits['a','b','c','d','e']   
  * if above two elements are same in rank print Three of kind
  * 
  * rank[1,2,2,3,4] suits['a','b','c','d','e']
  * 
  * if two elements same in rank print Pair
  * 
  *        
  *          
  *        
  */
        

	

}
