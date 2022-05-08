package p1;

public class StringBuilderBufferEg1 {

	public static void main(String[] args) {
    //String s="Hello";
	StringBuffer b=new StringBuffer(" ");	
    //StringBuffer->Thread Safe,method are synchronised
	//StringBuilder->not thread safe,
	//insert,append,replace,delete,reverse
	
	b.insert(2, "hi");
	System.out.println(b);
	
	b.append("Tamilnadu");
    System.out.println(b);
    
    b.replace(3, 5, "How");
    System.out.println(b);
    
    b.reverse();
    System.out.println(b);
    
    //b.deleteCharAt(i);
    System.out.println(b);
    b.indexOf("hello");
	}
}