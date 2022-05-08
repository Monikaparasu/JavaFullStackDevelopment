package p1;

import java.util.Scanner;

public class FindFactor {

	public static void main(String[] args) {
		int i,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		num=sc.nextInt();
		System.out.println("factor of "+num+ "are");
		for(i=1;i<=num;i++) {
			if(num%i==0)
		{
			System.out.println(i);
		}

}
}
}