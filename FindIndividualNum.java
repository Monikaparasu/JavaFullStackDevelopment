package p1;

import java.util.Scanner;

public class FindIndividualNum {

	public static void main(String[] args) {
		int num1,num2,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number1");
num1=sc.nextInt();
while(num1!=0)
{
	num2=num1%10;
	sum=sum+num1;
	num1=num1/10;
}
System.out.println("sum of the number "+sum);
	}

}
