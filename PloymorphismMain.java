package p1;
class Overloading
{
	void display()
	{
		System.out.println("display with no argument");
	}
	void display(int i)
	{
		System.out.println("one of the arg type integer");
	}
	void display (float i)
	{
		System.out.println("one of the arg type float");
	}
	void display(double i)
	{
		System.out.println("one of the arg type double ");
	}
	void display (String i)
	{
		System.out.println("one of the arg type string");
	}
	void display (int i, int j)
	{
		System.out.println("two arg of type integer");
	}
	void display (int i ,float j)
	{
		System.out.println("two arg of type integer and float");
	}	
	void display(float j, int i)
	{
		System.out.println("two arg of type float and integer");
	}
}
public class PloymorphismMain {

	public static void main(String[] args)
	{
		Overloading ob=new Overloading();
		ob.display();
		ob.display(342.54);
		ob.display(654.34f);
		ob.display(76);
		ob.display(43,66.88f
				);
		ob.display(43.5f,33);
	}
}
		
	
