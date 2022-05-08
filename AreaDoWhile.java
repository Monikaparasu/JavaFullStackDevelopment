package p1;
import java.util.Scanner;
public class AreaDoWhile {

public static void main(String[] args)
{
		float length,breadth,base,height,side,radius,area; 
		int choice;
		char ch;
		Scanner sc=new Scanner(System.in);
do
{
	System.out.println("///////////MENU///////////");
	System.out.println("1.area of square");
	System.out.println("2.area of triangle ");
	System.out.println("3.area ofcircle" );
	System.out.println("4.area of rectangle");
choice=sc.nextInt();
switch(choice)
{
case 1:
	System.out.println("find area of square");
	System.out.println("enter side of square");
	side=sc.nextFloat();
	area=side*side;
	System.out.println("area of square side "+side+ "is" +area);
	break;
case 2:
	System.out.println("find area of triangle");
	System.out.println("enter base of triangle");
	base=sc.nextFloat();
	System.out.println("enter height of triangle");
	height=sc.nextFloat();
	area=(base*height)/2;
	System.out.println("area of triangle "+base+ "and" +height+" is " +area);
	break;
case 3:
	System.out.println("find radius of circle ");
	System.out.println("enter radius of circle  ");
	radius=sc.nextFloat();
	area=(3.14f*radius*radius);
	System.out.println("radius of the circle "+radius+ "is"+area);
	break;
case 4:
	System.out.println("find area of rectangle");
	System.out.println("enter lenght of rectangle");
	length=sc.nextFloat();
	System.out.println("enter breadth of rectangle");
	breadth=sc.nextFloat();
	area=length*breadth;
	System.out.println("area of reactangle "+length+ "and " +breadth+ "is " +area);
	break;
	default:System.out.println("invalid input");
}
System.out.println("do u want to continue Y/N");
	ch=sc.next().charAt(0);
}
while(ch!='N');
}
}
