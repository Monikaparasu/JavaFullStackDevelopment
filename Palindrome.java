package p1;

import java.util.Scanner;

public class Palindrome {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
	           int num, digit, rev=0;
	           System.out.println("Enter a number");
	           num = sc.nextInt();
	           System.out.println("before while num="+num);
	           int num1=num;
	           while(num!=0) {
	        	   digit=num%10;  
	        	   rev = rev*10+digit;
	        	   num=num/10;  
	           }
	          System.out.println("Reversed Number is "+rev);
	                  
	          if(rev==num1) {
	        	  System.out.println("Palindrome");
	          }else {
	        	  System.out.println("Not palindrome");
	          }
	           
	       }
	}


	


