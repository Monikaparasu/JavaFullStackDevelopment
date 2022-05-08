package p1;

import java.util.Scanner;

public class MatrixSumMultiplication {

	public static void main(String[] args) {
int i,j,row,col,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of.rows");
		row=sc.nextInt();
		System.out.println("enter no.of.cols");
	    col=sc.nextInt();
	    int a[][]=new int[row][col];
	    System.out.println("enter the matrix element");
	    for(i=0;i<row;i++)
	    {
	    
	    	for(j=0;j<col;j++)
	    	{ 
	    		a[i][j]=sc.nextInt();
	    }
	    		}

        System.out.println("enter the matrix element");
        for(i=0;i<row;i++)
{
        	for(j=0;j<col;j++)
        	{
        		System.out.print(a[i][j]+"");
        	}
        System.out.print(" ");
}
        for(i=0;i<row;i++)
        {
        	for(j=0;j<col;j++)
        {
        	if(i==j)
        	{
        		sum=sum+a[i][j];
        	
            }
            }
        	}
        System.out.println("Sum of diagonal element matrix multiplication= " +sum);
}
}	