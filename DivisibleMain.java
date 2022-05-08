//Divisible main using scanner//
package p1;

import java.util.Scanner;

public class DivisibleMain {
	public static void main(String[]args)
	{
int n;
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter number");
n=Sc.nextInt();
 if(n%3==0 && n%5==0)
 {
	 System.out.println("number divisible by 3 and 5");
 }
 else if(n%3==0)
{
	 System.out.println(n+"is divisible by only 3");
}
 else if (n%5==0)
 {
	 System.out.println(n+"is divisible by only 5");
 }
 else 
 {
	 System.out.println("not divisible");
 }
}
}