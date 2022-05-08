package p1;
import java.util.Scanner;

public class StringWord {

	public static void main(String[] args) {
		String s;
		int w=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter words ");
		s = sc.nextLine();
		String s1=s.toLowerCase();
				
		System.out.println("No of characters ="+s.length());
		
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch==' ') 
			{
				w=w+1;
}
			System.out.println("no.of.words=  " +w);
		}
	}
}