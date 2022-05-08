package p1;
import java.util.Scanner;
public class StringUserCredential
{

	public static void main(String[] args) {
		String uname,upswd;
		int i;
		Scanner sc=new Scanner(System.in);
	System.out.println("you have maximum 3 attempt to login");
	System.out.println("your account will be locked");
	System.out.println("you can try after 24 hrs");
for(i=1;i<3;i++)
System.out.println("enter the user name");
uname=sc.nextLine();
System.out.println("enter the userpassword");
upswd=sc.nextLine();

if(uname.equals("admin") && upswd.equals("admin123"))
{
	System.out.println("login successfully");
}
else
{
	System.out.println("invalid username or password");
	System.out.println( i+ "attempts are over ");
}

	if(i==4)
	{
		System.out.println("Sorry your account is locked you can try after 24 hours");
	}
}
}
