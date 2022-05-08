package p1;

import java.util.Scanner;

public class StringUserNamePassword {

	public static void main(String[] args) {
		String uname,upass;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		uname=sc.next();
		System.out.println("enter the password");
        upass=sc.next();
        
        if(uname.equalsIgnoreCase("admin") && upass.equals("admin123"));
        {
        System.out.println("login successfully");
        
        }
         else
        {
        	System.out.println("invalid user id");
        }
}
}
