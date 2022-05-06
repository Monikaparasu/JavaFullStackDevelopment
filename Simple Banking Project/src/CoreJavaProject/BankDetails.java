package CoreJavaProject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class BankDetails {
	
		static Connection scon=null;
		static ResultSet rs=null;
		static Statement st=null;
	static String Accno;
	static String Name;
	static String Acc_Type;
	double Balance;
	static Scanner sc=new Scanner(System.in);
	//method to open new account
	public void OpenAccount()
	{   System.out.println("Enter Customer Name:");
	    Name=sc.next();
		System.out.println("Enter Account No:");
		Accno=sc.next();
		System.out.println("Enter Account Type:");
		Acc_Type=sc.next();
		System.out.println("Enter Balance");
		Balance=sc.nextDouble();
	}
    //method to display account details
	public void ShowAccount()
	{
		System.out.println("Name of the AccountHolder:"+Name);
		System.out.println("Account no:"+Accno);
		System.out.println("Account Type:"+Acc_Type);
		System.out.println("Balance:"+Balance);
	}
	//method to deposit money
	public void deposit()
	{
		double amt;
		System.out.println("Enter the amount you want to deposit:");
		amt=sc.nextDouble();
		Balance=Balance+amt;
		{
			System.out.println("you successfully Deposited the amount!");
		}
	}
	//method to withdraw money
	public void WithDraw()
	{
		double amt;
		System.out.println("Enter the amount you want to withdraw:");
		amt=sc.nextDouble();
		if(Balance>=amt)
		{
			Balance=Balance-amt;
			System.out.println("Balance after withdraw:"+Balance);
		}
		else
		{
			System.out.println("Your balance is less than" +amt+ "\tTransaction Failed....!!!!");
		}
	}
	//method to search an account number
	public boolean Search(String Accno) {
		if(Accno.equals(Accno))
		{
			ShowAccount();
			return(true);
		}
		return(false);
	}


	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//create initial accounts
		System.out.println("How many number of customer do you want to input?");
		int n=sc.nextInt();
		BankDetails C[]=new BankDetails[n];
		for(int i=0;i<C.length;i++)
		{
			C[i]=new BankDetails();
			C[i].OpenAccount();
			}
//loop runs until number 5 is not pressed to exit
		int ch;
		do
		{
			System.out.println("\n***Banking System Application***");
			System.out.println("1.Display all Account details \n 2.Search by Account number\n 3.Deposit the amount \n 4.Withdraw the amount \n 5.Exit ");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					for(int i=0;i<C.length;i++)
					{
						C[i].ShowAccount();
			}
			break;
			case 2:
				System.out.println("Enter accountno.you want to search: ");
				String ac_no=sc.next();
				boolean found =false;
				for(int i =0;i<C.length;i++)
					{
					found =C[i].Search(ac_no);
					if(found)
						{
						break;
						}
						}
				if (found)
				{
					System.out.println("Search failed!Account doesn't exist...!!!");
				}
				break;
			case 3:
				System.out.println("Enter Accountno.:");
				ac_no=sc.next();
				found=false;
				for(int i=0;i<C.length;i++)
				{
					found=C[i].Search(ac_no);
					if(found)
					{
						C[i].deposit();
						break;
					}
				}
				if (found)
				{
					System.out.println("Search failed! Account doesn't exist...!!");
				}
				break;
			case 4:
				System.out.println("Enter Account No:");
				ac_no=sc.next();
				found=false;
				for(int i=0;i<C.length;i++)
				{
					found =C[i].Search(ac_no);
					if(found)
					{
						C[i].WithDraw();
						break;
					}
				}
				if (!found)
				{
					System.out.println("Search failed!Account doesn't exist...!!");
				}
				break;
			}
		}
		while(ch!=5);
	}
	public static void DisplayCustomerInfo() {
		// TODO Auto-generated method stub
		//get the Connection
		try
		{
			scon=DbConnect.getConnection();
			st=scon.createStatement();
			String sql="select * from BankDetails";
			rs=st.executeQuery(sql);
		
					System.out.println("Accno\tName\tAcctype");
					while(rs.next())
					{
						System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
					}
		}
		
		 catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
public static void UpdateCustomerInfo() {
		
			try {
				scon = DbConnect.getConnection();
				st=scon.createStatement();
			  String sql="select * from BankDetails where Accno="+Accno; //get only one row
			  //check id exists
			  rs=st.executeQuery(sql);
			  if(rs.next()) { //if true record exists
				  //Update operation when record exists
				  System.out.println("Enter customer Accno to change");
					String Name=sc.next(); 
				String upd="update BankDetails set Accno='"+Accno+"' where Name="+Name;
				int  i=st.executeUpdate(upd);
				
				if(i>0) {
					System.out.println("Record is Updated");
				}//if(i>0>
				}//if
			  else {
				  System.out.println("Record not exists");
			  }//else
			  
		}//try
			catch(Exception e) {
			e.printStackTrace();
		}//catch
		}

	public static void  InsertCustomerInfo() {
		//get the connection
				try {
					scon=DbConnect.getConnection();
					st=scon.createStatement();
					System.out.println("My connection"+scon);
					
					//Input data from user
					System.out.println("Enter Accno of customer");
					Accno=sc.next();
					//Check id exists
					String sql="select * from BankDetail  where Accno="+Accno;
					rs=st.executeQuery(sql);
					
					if(!rs.next()) {
						System.out.println("Enter customer name");
						Name=sc.next();
						System.out.println("Enter Acc_Type of customer  ");
						Acc_Type=sc.next();
						
				String ins="insert into edustudent values("+Accno+",'"+Name+"','"+Acc_Type+"')";
						int  i =st.executeUpdate(ins);
						if(i>0) {
							System.out.println("Customer information is registered");
						}
					}else {
						System.out.println("Accno already exists Choose another Accno");
					}
		} catch (Exception e) {
				
					e.printStackTrace();
				}  
			}
	public static void DeleteCustomerInfo() {
		System.out.println("Enter customer Accno to delete record");
		Accno=sc.next();
		//check id exists
		//if exists go for delete else display id not exists
		
		scon=DbConnect.getConnection();
		try {
			st=scon.createStatement();
			
			String sql = "select * from BankDetails where Accno="+Accno;
			rs=st.executeQuery(sql);
			
			if(rs.next()) {
				String del = "delete from BankDetails where Accno="+Accno;
				int i=st.executeUpdate(del);
				if(i>0) {
					System.out.println("The customer with the "+Accno+" is deleted");
				}
			}else {
				System.out.println(Accno+ " not exists in database");
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public static void SelectCustomerInfo()
	{
		try
		{
			scon=DbConnect.getConnection();
			st=scon.createStatement();
			System.out.println("Enter Student to display information");
			Accno=sc.next();
			String sql="select * from BankDetails where Accno="+Accno;
			rs=st.executeQuery(sql);
			if(rs.next())
			{
				System.out.println(rs.getInt(1) +" "+rs.getString(2)+" "+rs.getString(3));
			}
			else
			{
				System.out.println("ID not found");
			}
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
		

