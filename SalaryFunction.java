package p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class salary
{
String name;
String address;
int phone;
String subjectspecialization;
float monthlysalary;
float incometax;
float annualsalary;

void acceptdetails()throws IOException
{
InputStreamReader is =new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(is);

System.out.println("enter the employee name ");
name=br.readLine();

System.out.println("enter the employee address");
address=br.readLine();

System.out.println("enter the employee phone");
phone=Integer.parseInt(br.readLine());

System.out.println("enter the employee subjectspecialization");
subjectspecialization=br.readLine();

System.out.println("enter the employee monthlysalary");
monthlysalary=Float.parseFloat(br.readLine());

System.out.println("enter the employee incometax");
incometax=Float.parseFloat(br.readLine());
}
void displaydetails()
{
	System.out.println("name=" +name);
    System.out.println("address=" +address);
    System.out.println("phone=" +phone);
    System.out.println("subjectspecialization="+subjectspecialization);
    System.out.println("monthlysalary="+monthlysalary);
    System.out.println("incometax="+incometax);
}

void incometax()
{
	if(annualsalary>175000)
	{
		incometax=(5/100)*(annualsalary-175000);
		annualsalary=12*monthlysalary;
	}
}
public class SalaryFunction {

	public static void main(String[] args)throws IOException
	{
		SalaryFunction ob=new SalaryFunction();
		ob.acceptdetails();
		ob.displaydetails();
		ob.incometax();
	}
}
}