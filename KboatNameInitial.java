// Write a program in Java to accept a name(Containing three words) and Display only the initials (i.e., first letter of each word).
//Sample Input: LAL KRISHNA ADVANI
//Sample Output: L K A
package p1;
import java.util.Scanner;

public class KboatNameInitial
{
    public static void main(String args[]) {
    	String lWord;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a name of 3 or more words:");
        String str = in.nextLine();
        int len = str.length();

        System.out.print(str.charAt(0) + " ");
        for (int i = 1; i < len; i++) 
        {
            char ch = str.charAt(i);
            if (ch == ' ')
            {
                char ch2 = str.charAt(i + 1);
                System.out.print(ch2 + " ");
            }
        }
    

 
System.out.println("The longest word: " + lWord + ": The length of the word: " + lWord + "lWord.length()") ;
    }
    
}

