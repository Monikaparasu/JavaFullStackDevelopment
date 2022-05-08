package p1;

import java.util.Scanner;

public class ArraySumAvg {

	public static void main(String[] args) {
		int sum=0;
		float avg;
		int a[]=new int[10];	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter" +a.length+ "element " );
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
	}
	System.out.println("entered array elements are ");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}	
		System.out.println("to java.lang.Systemfind sum of all array elements");
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		
			System.out.println("sum " +sum);	
		avg=(float)sum/a.length;
		{
			System.out.println("average =" +avg);
		}
		}

}
