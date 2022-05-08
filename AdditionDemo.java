package p1;
class Addition
{
		int i,j;
		Addition()
		{
			System.out.println("After object creation");
			i=2;
			j=5;
		}
	public class ConstructorsDemo
	{
public static void main(String []args) {
Addition ob=new Addition();//calls constructor
System.out.println("i=" +ob.i);
System.out.println("j=" +ob.j);
}
}
}

	