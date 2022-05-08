package p1;

import java.util.Scanner;

public class RateDisount {

	public static void main(String[] args) {
		 float rate,price;
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the rate of the product");
		rate=Sc.nextFloat();
		
		if(rate>=1000 && rate<=2000)
		{
			price=(rate*2)/100;
		}
		else if(rate >=2001 && rate<=4000)
		{
			price=(rate*3)/100;
		}
			else if(rate>=4001 && rate <=6000 )
			{
			price=(rate*4)/100;
			}
			else
			{
				price=(rate*5)/100;
			}
		
System.out.println("discount price is"+price);
System.out.println("after discount price is" +(rate-price));

	}

}

