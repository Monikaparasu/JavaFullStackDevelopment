package p1;

import java.util.Scanner;

public class Forfactorial 
{
	public static void main(String[]args)
	{
	int i,fact=1,num;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	for(i=0;i>=1;i--)
	{
		fact=fact*i;
	}
System.out.println(" factorial of 5 "+fact);

}}