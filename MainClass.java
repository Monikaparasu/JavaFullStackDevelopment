package p1;
import java .util.Scanner;
class Student
{
	//called instance variables
	String ename;
	int eid;
	float  esalary;
	String edept;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a ename");
		ename=sc.nextLine();
		System.out.println("Enter a eid");
		eid=sc.nextInt();
		System.out.println("Enter a esalary");
		esalary=sc.nextFloat();
		System.out.println("Enter edept");
	
	}
	void display()
	{
	System.out.println("name=" +ename);
	System.out.println("sid=" +eid);
	System.out.println("salary=" +esalary);
	System.out.println("dept=" +edept);
	}

public class MainClass {

	public static void main(String[] args) {
		{
			Student sob=new Student();
			sob.input();
			sob.display();
		}

	}

}
}
