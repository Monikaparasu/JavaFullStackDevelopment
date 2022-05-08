package p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Railway {
String pname,pcoach;
long pmobno;
int pamount,ptotal_amount;
void accept() throws IOException
{
	InputStreamReader is=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(is);
	
	System.out.println("enter passanger name");
	pname=br.readLine();
	
	System.out.println("enter passanger coach");
	pcoach=br.readLine();
	
	System.out.println("enter passanger mobno");
	pmobno=Long.parseLong(br.readLine());
	
	System.out.println("enter passanger amount");
	pamount=Integer.parseInt(br.readLine());
	
}
void update()	
{   
	if(pcoach.equalsIgnoreCase("First_Ac"))
	{
		ptotal_amount=pamount+700;
	}
	else if (pcoach.equalsIgnoreCase("Second_Ac"))
		{
			ptotal_amount=pamount+500;
		}
	else if(pcoach.equalsIgnoreCase("Third_Ac"))
	{
		ptotal_amount=pamount+250;
	}
	else if(pcoach.equalsIgnoreCase("Sleeper"))
	{
		ptotal_amount=pamount;
	}
}
	void display()
	{
		System.out.println("name="+pname);
		System.out.println("coach="+pcoach);
		System.out.println("mobno="+pmobno);
		System.out.println("total_amount="+ptotal_amount);
	}
public static void main(String[] args) throws IOException
{
		Railway ob=new Railway();
		ob.accept();
		ob.update();
		ob.display();
}
}
