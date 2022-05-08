package p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Transportcompany {
	String name;
	double weight,charge=0,total_charge=0;
	
	void accept()throws IOException
	{
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		
		System.out.println("enter the  customer name");
		name=br.readLine();
		
		System.out.println("enter the weight of the parcel");
		weight=Double.parseDouble(br.readLine());
	
		System.out.println("enter total_charge");
		total_charge=Double.parseDouble(br.readLine());
		
		}

void calculate()
{
	if(weight<=10)
	{
		charge=25*weight;
		total_charge=charge+0.05*charge;
	}
	else if(weight>10 && weight<=30)
	{
		charge=20*weight;
		total_charge=charge+0.05*charge;
	}
	else if(weight>30)
	{
		charge=10*weight;
		total_charge=charge+0.05*charge;
	}
}

void print()
{
	System.out.println("name="+name);
	System.out.println("weight="+weight);
	System.out.println("charge="+charge);
    System.out.println("total_charge="+total_charge);
    
}


	public static void main(String[] args)throws IOException
	{
	Transportcompany bill=new Transportcompany();
    bill.accept();
    bill.calculate();
    bill.print();
    
	}
}
