package p1;
import java.util.Scanner;
public class StringVowel {
	public static void main(String[] args) {
		String s;
		int c=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter string");
	    s=sc.nextLine();
	    String s1=s.toLowerCase();
	    System.out.println("no.of character = "+s.length());
	    for( int i=0;i<s1.length();i++)
	    {
	    	char ch=s1.charAt(i);
	    if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
        c=c+1;
	}
        System.out.println("no of vowels=" +c);
        }
}