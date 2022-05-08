package p1;
import java.util.Scanner;
public class StringVowelRemove {
	public static void main(String[] args) {
		String s1,s2;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter string");
	    String s = sc.nextLine();
		 s1 = sc.nextLine();
	    s2=s1.replaceAll("aeiou", s);
	    
	
        System.out.println(s2);
        }
}
	