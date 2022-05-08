package p1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
int a=0,i;
String s=" ",rev=" ";
Scanner sc=new Scanner(System.in);
System.out.println("enter the name");
s=sc.nextLine();
for(i=s.length()-1;i>=0;i--)
{
	char ch=s.charAt(i);
	rev=rev+ch;
}
System.out.println("reversing the string " +rev);
	}
}
