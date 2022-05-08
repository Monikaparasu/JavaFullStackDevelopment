package p1;

import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {
int a[]=new int[5];
int i;
//input array element//
Scanner sc=new Scanner(System.in);
System.out.println("enter array element "+a.length);
for(i=0;i<a.length;i++)
{
	a[i]=sc.nextInt();
}
//display array element//
{
	System.out.println("array element are");
for(i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}
}
}
}	
