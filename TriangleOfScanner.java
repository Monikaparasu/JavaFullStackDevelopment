package p1;

import java.util.Scanner;

public class TriangleOfScanner {

	public static void main(String[] args) {
		int b,h,tri;
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the b");
		b=Sc.nextInt();
		System.out.println("enter the h");
		h=Sc.nextInt();
		tri=(b*h)/2;
		System.out.println("enter triangle"+b+ "and"+h+ "is"+tri);
		tri=Sc.nextInt();
		

	}

}
