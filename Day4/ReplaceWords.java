package leetcoded4;

import java.util.Scanner;

public class ReplaceWords {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the sentance");
		String sentance=scan.nextLine();
		
		String arr[]=sentance.split(" ");
		
		int i=0,j=0;
		System.out.println("Enther the dictionary size");
		int size=scan.nextInt();
		String dictionary[]=new String[size];
		
		System.out.println("Enter the element to dictionary");
		for(i=0;i<size;i++)
		{
			dictionary[i]=scan.next();
		}
		
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<dictionary.length;j++)
			{
				if(arr[i].contains(dictionary[j]))
				{
					arr[i]=dictionary[j];
					break;
				}
			}
		}
		System.out.println("The new sentance");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
