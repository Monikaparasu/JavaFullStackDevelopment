package p1;
import java.util.Scanner;
public class WordFirstLetter_Initial {
 
		public static void main(String[] args) {
			
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the 3 words");
			String s=sc.nextLine();
			int pai=s.indexOf(' ');
			int lis=s.lastIndexOf(' ');
			String s1=s.charAt(0)+"."+s.charAt(pai+1)+"."+s.substring(lis+1);
			System.out.println(s1);
		}
 }