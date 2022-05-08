package p1;
class Addition1
{
	int a;
	int b;
	float bf;
	double c;

void add(int a,int b)
{
	int sum=a+b;
	System.out.println("sum of two int value is ="+sum);
}
void add(int a,float bf)
{
	float sum=a+bf;
	System.out.println("sum of integer and float value is= "+sum);
}
void add(int a,double c)
{
	double sum=a+c;
	System.out.println("sum of integer and double value is="+sum);
}
}
public class OverloadingAddition {

	public static void main(String []arg)
	{
Addition1 ob=new Addition1();
ob.add(23,44);//int
ob.add(55,87.65f);//float
ob.add(66,90.7);//double
	}

}

