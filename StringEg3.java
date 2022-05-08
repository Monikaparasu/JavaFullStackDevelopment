package p1;

import java.util.Scanner;

public class StringEg3 {

	public static void main(String[] args)
	{    
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter string ");//computer
		String s1=sc.nextLine().toLowerCase();
		StringBuffer s=new StringBuffer(s1);
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' ||ch=='o'||ch=='u')
			{
				System.out.println(ch);
			continue;
			}
			else
			{
				 ch=ch+s1.charAt(i);//ch =cmptr
			}
	}

}
}