package p1;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		int num,squarenum,digit,sum=0;
		Scanner sc=new Scanner(System.in);
		num =sc.nextInt();
		squarenum=num*num;
		while(squarenum!=0)
		{
			digit=squarenum%10;
			sum=sum+digit;
			squarenum=squarenum/10;
		}
		if(sum==num)
		{
			System.out.println("neon number");
		}
		else {
			System.out.println("noy a neon number");
		}
}
}

