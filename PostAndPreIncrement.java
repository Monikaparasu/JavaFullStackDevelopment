//post and pre increment// 
package p1;

public class PostAndPreIncrement {

	public static void main(String[]args) {
		int i;
		int k;
		i=7;
		k=i++;
		System.out.println("k="+k);
		System.out.println("i="+i);
		k=++i;
		System.out.println("k="+k);
		System.out.println("i="+i);
	}
}