package p1;

import java.util.Scanner;

public class WordOccurance {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int c=0;
		String s;
		System.out.println("Enter a sentence");
        s=sc.nextLine();
		String ch[]=s.split(" ");
		System.out.println("Enter word a search");
		String w=sc.next();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i].equals(w))
			{
				c++;
			}
		}
	}

}
