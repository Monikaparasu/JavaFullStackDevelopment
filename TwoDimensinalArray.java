// two dimensional array 2x2 matrix
package p1;

import java.util.Scanner;

public class TwoDimensinalArray {

	public static void main(String[] args) {
	int a[][]=new int[2][2];
	Scanner sc=new Scanner (System.in);
	System.out.println("enter 2x2 matrix");
	for(int r=0;r<2;r++)
	{
		for(int c=0;c<2;c++)
		{
			a[r][c]=sc.nextInt();
		}
	}
System.out.println("enter the matrix is ");
for( int r=0;r<2;r++)
{
	for( int c=0;c<2;c++)
	{
		System.out.print(a[r][c] + " ");
	}
System.out.println();	
}

}
}