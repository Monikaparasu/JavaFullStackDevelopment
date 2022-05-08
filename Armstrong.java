package p1;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int num,num1,digit,sum=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(num!=0) 
		{
			digit=num%10;  
 	   sum=sum+digit*digit*digit;
 	   num=num/10;
		}
		if(sum==num)
		{ 
 	   System.out.println("armstrongnumber");
		}
		else
		{
			System.out.println("not an armstrong");
		}
  
}
}