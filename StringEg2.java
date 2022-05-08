package p1;

import java.util.Scanner;

public class StringEg2
{

	public static void main(String[] args) 
	{
	String s="Mohandas Karamchand Gandhi";
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string with 3 words");
	s
	=sc.nextLine();
	int sp=s.indexOf(' ');
	int lis=s.lastIndexOf(' ');
	String s1=s.charAt(0)+"."+s.charAt(sp+1)+" ."+s.substring( lis+1);
	System.out.println(s1);
	}


}
