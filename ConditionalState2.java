import java.util.Scanner;

public class ConditionalState2
{

	public static void main(String[] args)
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		if(num>0)
		{
			System.out.println("Number is greater than zero "+num);
		}
		else
		{
			System.out.println("Number is less than zero "+num);
		}
		
	}

}
