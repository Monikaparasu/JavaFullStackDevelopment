//banking process//
package p1;

import java.util.Scanner;

public class BankingProcess {

	public static void main(String[] args) {
		int choice;
		float amount =30000,deposite_amount,withdraw_amount;
		Scanner sc=new Scanner(System.in);
		System.out.println("*****Option******");
		System.out.println("1.deposite_amount");
		System.out.println("2.withdraw_amount");
		System.out.println("3.display the current amount");
		System.out.println("enter the choice");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			
			System.out.println("enter the deposite_amount");
			deposite_amount=sc.nextFloat();
			if(deposite_amount>0)
			{
				amount=amount+deposite_amount;
			System.out.println(" amount is deposite "+amount);
			}
			else
			{
				System.out.println("deposite amount shouldn't be negative");
			}
			break;
		case 2:
			
			System.out.println("enter the withdraw_amount");
			withdraw_amount=sc.nextFloat();

			
			if(withdraw_amount<amount)
			{
				amount=amount-withdraw_amount;
			System.out.println("withdraw amount is"+amount);
			}
			else {
				System.out.println("insufficient amount");
			}
			break;
		case 3:
		
		System.out.println("display the current amount");
		 
		System.out.println("display the current amount"+ amount);
		break;
		
		default: 
		System.out.println("invalid input");
		
			
		
	}

}
}
