//even and odd using scanner// 
package p1;

	import java.util.Scanner;

	public class EvenOdd {

	    public static void main(String[] args) {

	        try (Scanner Input = new Scanner(System.in)) {
				System.out.print("Enter a number: ");
				int num = Input.nextInt();
				

				if(num % 2 == 0)
				    System.out.println(num + " is even");
				
				
      else
				    System.out.println(num + " is odd");
			}
	    }
	}

