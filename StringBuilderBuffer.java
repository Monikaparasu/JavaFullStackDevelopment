package p1;

public class StringBuilderBuffer {

	public static void main(String[] args) {
		//insert function
		StringBuffer b=new StringBuffer("Hello");
		b.insert(2,"India");
		System.out.println("After insert "+b);
        
		//append
		b.append("Hi");
		System.out.println("After append "+b);
	   
		//reverse
		b.reverse();
		System.out.println("After reverse "+b);
	 
		//replace
		b.replace(3,4, "How are you?");
		System.out.println("After reverse "+b);
	}
	}
