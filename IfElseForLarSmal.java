//If else statement using scanner//
package p1;

import java.util.Scanner;

public class IfElseForLarSmal {

	public static void main(String[] args)
	{
	int num;
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the number");
	num=Sc.nextInt();
	if(num>0)
	{
		System.out.println(num+" the greater than zero");

	}
	else
	{
		System.out.println(num+"the lesser than zero");
	}
	}
}
