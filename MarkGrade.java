//mark and grade using scanner//
package p1;


import java.util.Scanner;

public class MarkGrade
{
    public static void main(String args[])
    {
        char grade;
        Scanner Sc=new Scanner(System.in);
     grade =Sc.next().charAt(0);
     
        if(grade=='A')
        {
            System.out.println("marks range is 90-100");
        }
        else if(grade=='B')
        {
           System.out.println("marks range is 70-80");
        } 
        else if(grade=='C')
        {
            System.out.println("markd range is 40-69");
        }
        else if(grade=='D')
        {
            System.out.println("marks range is 0-39");
        }
        else 
        {
        	System.out.println("invalid");
        }
    }


}
