package p1;
import java.util.Scanner;
public class ElectricityBill {
	public static void main(String[] args) {
		int units;
		double amount,charge,total_amount ,fixed_rate=350;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the unit that you  consumed");
        units=sc.nextInt();
        if(units<100) {
        	amount =units *1.50+fixed_rate;
        }
        else if(units>=101 && units<=150)    
        {
        	amount=100*1.50+(units-100)*2.00;
        }
        else if(units>=151 && units<=250)
        {
        	amount=100*1.50+50*2.00+(units-150)*2.50;
        }
        else
        {
        	amount=100*1.50+50*2.00+100*2.5+(units-250)*4.00;
        }
        System.out.println ("the total amount is "+amount+fixed_rate);
        }
}
