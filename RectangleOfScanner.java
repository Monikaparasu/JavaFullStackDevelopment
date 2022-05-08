//rectangle using scanner//
package p1;

import java.util.Scanner;

public class RectangleOfScanner {
	public static void main(String []args)
	{
	float l,b,rec;
	Scanner Sc=new Scanner(System.in);
	System.out.println("area of length");
	l=Sc.nextFloat();
	System.out.println("area of breadth");
	b=Sc.nextFloat();
	float recf= (l*b);
	System.out.println("area of recf"+l+ "and" +b+ "is"+recf);
	rec=Sc.nextFloat();
	}
	

}
