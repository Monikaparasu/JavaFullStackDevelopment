package p1;

import java.util.Scanner;

public class StringFunction {

	public static void main(String[] args) {
		int c=0;
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		System.out.println("enter a string");
		s=sc.nextLine();
		System.out.println("enter a character");
	    char ch=sc.next().charAt(0);
	    {
		for(int i=0;i<s.length();i++)
			if (ch==s.charAt(i))
			{
				c++;
			}
	}
	System.out.println(ch+ "character is present "+c+"times");
}
}