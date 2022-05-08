//employee detail using scanner// 
package p1;

import java.util.Scanner;

public class EmploeeDetail {
 

	public static void main(String[] args) {
		String name;  //store employee name
		int age;   //store age of an employee
		float sal;  //store employee sal
		char gen;  //emp gen
		
		try (Scanner Sc = new Scanner(System.in)) {
			System.out.println("Enter employee name");
			name=Sc.nextLine(); //String
			System.out.println("Employee age");
			age=Sc.nextInt(); //int
			System.out.println("Enter Employee salary");
			sal=Sc.nextFloat(); //float
			System.out.println("Enter gender of Employee");
			gen=Sc.next().charAt(0);
		}
		
		System.out.println("Employee Details");
		System.out.println("Name ="+name);
		System.out.println("Age="+age);
		System.out.println("Salary="+sal);
		System.out.println("Gender="+gen);
		
		

	}

}
