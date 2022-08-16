package leetcoded8;

import java.util.Scanner;

public class SetMatrixZeros {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the size of matrix");
		int size=scan.nextInt();

		System.out.println("Enter the colomn ");
		int colom=scan.nextInt();
		int row[]=new int[size],col[]=new int[size],i=0,j=0;
		for(i=0;i<size;i++)
		{
			row[i]=1;
		}
		for(i=0;i<colom;i++)
		{
			col[i]=1;
		}
		int mat[][]=new int[size][colom];
		System.out.println("Enter the elements to the matrix");
		for(i=0;i<size;i++)
		{
			for(j=0;j<colom;j++)
			{
				mat[i][j]=scan.nextInt();
				if(mat[i][j]==0)
				{
					row[i]=0;
					col[j]=0;
				}
			}

		}

           scan.close();
		for(i=0;i<size;i++)
		{
			for(j=0;j<colom;j++)
			{
				if(row[i]==0||col[j]==0)
				{
					mat[i][j]=0;
				}
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
/*size =3;
 * mat=1 2 3
 *     4 0 5
 *     6 7 8
 *     
 * Output:1 0 3
 *        0 0 0
 *        6 0 8
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
}
