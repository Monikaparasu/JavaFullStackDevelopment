package p1;

import java.util.Scanner;

public class SwitchUpperCase {

	public static void main(String[] args) {
		
char ch;
Scanner Sc=new Scanner(System.in);
System.out.println("enter a character");
ch=Sc.next().charAt(0);
switch(ch)
{
case'A':
case'E':
case'I':
case'O':
case'U':
System.out.println("vowel");
	break;
	default:System.out.println("not an vowel");

}
	
}
}