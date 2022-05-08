package p1;

public class StringInsAppRevRelDel {

	public static void main(String[] args) {
		//insert function
		StringBuffer b=new StringBuffer("hello");
		b.insert(2,"India");
		System.out.println("After insert "+b);
		//append
		b.append("Hi");
        System.out.println("After append "+b);
	    //reverse
		b.reverse();
		System.out.println("After reverse" +b);
		//replace
		
		b.replace(3,4,"how are you");
		System.out.println("After replace "+b);
        //delete
		b.delete(2,5);
		System.out.println("after delete "+b);
        //particular charater to delete
		b.deleteCharAt(5);
		System.out.print(b);
	}
}

		