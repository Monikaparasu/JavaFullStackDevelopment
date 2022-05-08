//Switch case calculator for addition and substraction//
package p1;

		import java.util.Scanner;

		public class SwitchCalculator {

			public static void main(String[] args) {
				int firstnum,secondnum,ans,choice;
				Scanner Sc=new Scanner(System.in);
				
				
				System.out.println("Enter firstnumber");
				firstnum=Sc.nextInt();
				System.out.println("Enter secondnumber");
				secondnum=Sc.nextInt();
				
				System.out.println("**********MENU************");
				
				System.out.println("1.Addition");
				System.out.println("2.Subtraction");
				System.out.println("please Enter your choice");
				choice=Sc.nextInt();
				
				switch(choice) {
				case 1: ans=firstnum+secondnum;
				         System.out.println("addition of "+firstnum+" and "+secondnum+" is "+ans);
				         break;
				case 2:ans=firstnum-secondnum;
		        		System.out.println("difference of "+firstnum+" and "+secondnum+" is "+ans);
		        		break;
		        default:System.out.println("Invalid input");
				
				}
				
				
				
			}

		


	}


