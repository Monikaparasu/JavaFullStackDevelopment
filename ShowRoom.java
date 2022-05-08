package p1;

import java.util.Scanner;

public class ShowRoom 
{
String name=null;
long mobileno=0;
double cost=0.0;
double dis=0.0;
double amount=0.0;

void input()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter customer name");
	name=sc.nextLine();
	System.out.println("enter customer mobile number");
	mobileno=sc.nextLong();
	System.out.println("enter cost");
    cost=sc.nextDouble();
    System.out.println("enter the amount");
    amount=sc.nextDouble();
}
void calculator()
{
	if(cost<=10000)
	{
		dis=(cost*5)/100;
	}
	else if(cost>10000 && cost <=20000)
	{
		dis=(cost*15)/100;
	}
	else if(cost>20000 && cost <=35000)
	{
		dis=(cost*20)/100;
	}
	amount=cost-dis;
}
void display()
{
	System.out.println("Customer name="+name);
	System.out.println("mobileno= "+mobileno);
	System.out.println("cost="+cost);
	System.out.println("dis="+dis);
	System.out.println("amount after discount="+amount);
}

	public static void main(String[] args) {
	 ShowRoom ob=new ShowRoom();
			 ob.input();
			 ob.calculator();
			 ob.display();

	}

}
