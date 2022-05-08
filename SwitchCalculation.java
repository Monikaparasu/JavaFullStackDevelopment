//Multiplicaton,division,remainder,modulus//
package p1;
import java.util.Scanner;
public class SwitchCalculation
	{
		public static void main(String[] args) 
		{
			int firstnum,secondnum,thirdnum,fourthnum,ans,choice;
			
			Scanner Sc=new Scanner(System.in);
			
			System.out.println("Enter firstnumber");
			firstnum=Sc.nextInt();
			
			System.out.println("Enter secondnumber");
			secondnum=Sc.nextInt();
			
			System.out.println("Enter third number ");
			thirdnum=Sc.nextInt();
			
			System.out.println("Enter fourth number");
			fourthnum=Sc.nextInt();
		
			System.out.println("**********MENU************");
			
			System.out.println("1.Multiplication");
			System.out.println("2.Division");
			System.out.println("3.Remainder");
			System.out.println("4.Modulus");
			System.out.println("please Enter your choice");
			choice=Sc.nextInt();
switch(choice) 
{
case 1: ans=firstnum*secondnum;
System.out.println("multiplication of "+firstnum+" and "+secondnum+" is "+ans);
break;

case 2:ans=thirdnum/secondnum;
System.out.println("division of "+thirdnum+" and "+secondnum+" is "+ans);
break;

case 3:ans=firstnum%fourthnum;
System.out.println("remainder of "+firstnum+ " and " +fourthnum+ " is " +ans);
break;

case 4:ans=fourthnum%firstnum;
System.out.println("modulus of "+fourthnum+" and "+firstnum+ "is"+ans);
break;

default:System.out.println("Invalid input");
			
			}
			
			
			
		}

	


}




