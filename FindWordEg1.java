package p1;
import java.util.Scanner;
public class FindWordEg1 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	String s;
	int c=0;
	System.out.println("Enter a sentence");
	s=sc.nextLine();
	String ch[]=s.split(" ");
	System.out.println("Enter word to search");
    String w=sc.next();
    for(int i=0;i<ch.length;i++)
    {
    	if(ch[i].equals(w))
    	{
    		c++;
    	}
    }
	
System.out.println("occurance of word " +c) ;
String s1="Hello hi hi";
System.out.println(s1.replaceFirst("hi","hello")) ;
}
}