//simple interest using scanner//
package p1;

import java.util.Scanner;


public class SimpleInterest2
{
	public static void main(String []args)
	{
		float p,r,t,si;
	
	Scanner Input=new Scanner(System.in);
	System.out.println("enter the value of p");
	p=Input.nextFloat();
	System.out.println("enter the value of t");
	t=Input.nextFloat();
	System.out.println("enter the value of r");
	r=Input.nextFloat();
	System.out.println("enter the value of si");
	si=Input.nextFloat();
	si=(p*r*t)/100;
	System.out.println("enter the simple interest" +si);
	
	
	
	
	}
}
