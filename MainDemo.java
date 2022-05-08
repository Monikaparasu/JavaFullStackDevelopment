package p1;

public class MainDemo {
int k;//instance variable
	public static void main(String[] args) {
	System.out.println("Main");
	Student s[]=new Student[3];
	for(int i=0;i<s.length;i++)
	{
		s[i]=new Student();
	}
	for(int i=0;i<s.length;i++)
	{
		s[i].input();
	}
	System.out.println("Student details");
	for(int i=0;i<s.length;i++)
	{
		s[i].display();
	}
	}
}
