//NeitherEvenNorOdd using scanner//
package p1;

import java.util.Scanner;

public class NeitherEvenNorOdd 
{

	public static void main(String[] args) 
	{
		int num;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num=Sc.nextInt();
	
		if(num==0)
		{
			System.out.println("Neither even nor odd");
		}
		else if(num%2==0) 
		{ //true
			System.out.println(num+" is an Even number");
		}
		else
		{
			System.out.println(num+" is an odd number");
		}
	}
	
}

