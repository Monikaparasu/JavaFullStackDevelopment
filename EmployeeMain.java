package p1;
import java .util.Scanner;
class Employee
{
	//called instance variables
	String ename;
	int eid;
	float esalary;
	String edept;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name");
		ename=sc.nextLine();
		System.out.println("Enter a eid");
		eid=sc.nextInt();
		System.out.println("Enter a Salary");
	    esalary=sc.nextFloat();
		System.out.println("Enter department");
		edept=sc.nextLine();
	}
	void display()
	{
	System.out.println("name=" +ename);
	System.out.println("eid=" +eid);
	System.out.println("salary=" +esalary);
	System.out.println("dept=" +edept);
	}

public class MainClass {

	public static void main(String[] args) {
		{
			Employee sob=new Employee();
			sob.input();
			sob.display();
		}

	}
}
}