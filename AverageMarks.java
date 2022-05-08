package p1;
import java.util.Scanner;

public class AverageMarks
{

	public static void main(String[] args)
	{
int s1,s2,s3,s4,s5;
float avg;
Scanner Sc=new Scanner(System.in);
System.out.println(" first subject mark is");
s1=Sc.nextInt();
System.out.println(" second subject mark is");
s2=Sc.nextInt();
System.out.println(" third subject mark is");
s3=Sc.nextInt();
System.out.println(" fourth subject mark is");
s4=Sc.nextInt();
System.out.println(" fifth subject mark is");
s5=Sc.nextInt();
avg= (float)(s1+s2+s3+s4+s5)/5;
System.out.println("average mark ");
avg=Sc.nextFloat();
}

}
