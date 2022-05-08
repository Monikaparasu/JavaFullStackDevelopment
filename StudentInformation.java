//student information using scanner//
package p1;

import java.util.Scanner;

public class StudentInformation {

	public static void main(String[] args)
	{
        Scanner Input =new Scanner(System .in);
            String name;
			int age;
			float ffee;
			char gen;
		
			System.out.println("Enter your name");
			
			name=Input.nextLine();//read the line value  
			
			
			System.out.println("Enter your age");
			 age=Input.nextInt(); //read the integer value
			
			System.out.println("Enter your fee");
			 ffee=Input.nextFloat(); //read the float value
			
			System.out.println("Enter your gen");
			gen=Input.next().charAt(0);//read the char value
		
			
			System.out.println("String name="+name);
			System.out.println("int age="+age);
			System.out.println("float="+ffee);
			System.out.println("gen="+gen);
			}
	

}
