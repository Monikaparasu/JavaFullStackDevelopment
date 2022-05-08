package p1;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
	String name;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name");
	name=sc.nextLine();
	System.out.println("name "+name);
    System.out.println(" no.of.character "+name.length());
    System.out.println("convert to uppercase "+name.toLowerCase());
	}
}

	