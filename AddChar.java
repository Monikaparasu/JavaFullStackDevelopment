package p1;

public class AddChar {

	public static void main(String[] args) {
		
		String s="Mohandas Karamchand Gandhi";
		int pa=s.indexOf(" ");
		int li=s.lastIndexOf(' ');
		String s1=s.charAt(0)+"."+s.charAt(pa+1)+"."+s.substring(li+1);
		System.out.println(s1);
	}
}
		
		
		
		
		
		