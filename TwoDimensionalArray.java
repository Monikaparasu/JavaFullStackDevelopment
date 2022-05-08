package p1;
import java.util.Scanner;
public class TwoDimensionalArray {

	public static void main(String[] args) {
		int f[][];
		int m,n;
		Scanner sc=new Scanner (System.in);
System.out.println("enter the rows");
m=sc.nextInt();
System.out.println("enter the columns");
n=sc.nextInt();
 f=new int[m][n];
 System.out.println("enter " +m+ "X"+n+ "matrix "  );
 for(int r=0;r<m;r++)
 {
	 for(int c=0;c<n;c++)
	 {
		 f[r][c]=sc.nextInt();
 }	 
 }
System.out.println("entered matrix is");
 for(int r=0;r<m;r++)
 {
	 for(int c=0;c<n;c++)
	 {
		 System.out.print(f[r][c] + " ");
	 }
	 System.out.println();
 }
 }
}

