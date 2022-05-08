package p1;
import java.util.Scanner;
public class StringRevVowel {
	public static void main(String[]args)
	{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String");	
    String s=sc.nextLine().toLowerCase();
    StringBuffer s1=new StringBuffer(s);
    for(int i=0;i<s1.length();i++)
    {
    	char ch=s.charAt(i);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
    	s1.deleteCharAt(i);
}
}
System.out.println("After removing vowels "+s1);
}
}