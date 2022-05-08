package p1;
import java.util.Scanner;
public class ReverseStringEg1
{
public static void main(String []args) 
{
Scanner sc=new Scanner(System.in);
String s=" ",rev=" ";
int c=0,i;
System.out.println(" Enter the sentence");
s=sc.nextLine();
String ch[]=s.split(" ");
for( i=s.length()-1;i>=0;i--)
{
	char ch1 =s.charAt(i);
	rev=rev+ch1;
}
System.out.println("reversing the string" +rev);
}
}