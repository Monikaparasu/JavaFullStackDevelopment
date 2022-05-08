//celsius and fahrenheit//
package p1;

import java.util.Scanner;

public class Temperature{

public static void main(String []args) {
    int choice;
	float fahreheit,celsius;
 Scanner sc=new Scanner(System.in);	
 System.out.println("******Menu*******");
System.out.println("Enter  Fahrenheit temperature");
System.out.println(" Enter Celsius temperature");
System.out.println("place the choice");
choice=sc.nextInt();
switch (choice)
{
case 1:
	System.out.println("Enter  Fahrenheit temperature");
    fahreheit=sc.nextFloat();
    celsius=(fahreheit -32)*5/9;
    System.out.println("convert fahreheit into celsius is"+celsius);
    break;
case 2:
   System.out.println(" Enter Celsius temperature");
    celsius=sc.nextFloat();
    fahreheit=(celsius*9/5)+32;
    System.out.println("convert celsius into fehreheit is  "+fahreheit);
    break;
case 3:
	default:
	System.out.println("invalid");
}
}}   
    
	
	






