package p1;
import java.util.Scanner;

	public class ArrayFrequency {

		public static void main(String[] args) {
			int size,search_element,count=0;
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter size");
			size=sc.nextInt();
			int a[]=new int[size];
			a=new int[size];
			System.out.println("Enter "+size+" elements");
			for(int i=0;i<size;i++) {
				a[i]=sc.nextInt();
			}
			System.out.println("Enter search element");
			search_element = sc.nextInt();
			
			//Linear Search//
			for(int i=0;i<size;i++) {
				if(search_element==a[i]) {
					count=count+1;
				}
			}
			if(count==0) {
				System.out.println("Not found");
			}
			else {
				System.out.println(search_element+" found "+count+" times");
			}
				
		}
	}
