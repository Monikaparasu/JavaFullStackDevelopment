package p1;

import java.util.Scanner;

public class ArrayBubbleSort {
	public static void main(String[] args) {
		int a[],i,j,n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		n=sc.nextInt();
		 a= new int[n];
		System.out.println("enter the array element ");
        for(i=0;i<a.length;i++)
        {
        	a[i]=sc.nextInt();
        }
System.out.println("before sorting array element are");
for(i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}
//Bubble sort//
for(i=0;i<a.length-1;i++)
{
	for(j=0;i<a.length-1;j++)
	{
		if (a[j]>a[j+1])
		{temp=a[j];
		a[j]=a[j+1];
		a[j+1]=temp;
		}
	}
	System.out.println("sorted array element");
	for(i=0;i<a.length;i++)
	System.out.println(a[i]);
	}
	}
}