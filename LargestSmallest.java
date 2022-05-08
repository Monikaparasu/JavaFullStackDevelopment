package p1;

public class LargestSmallest {

	public static void main(String[] args) {
	
		int i=7;
		int k=5;
		int p;
		p=(i>k)?i:k;
		System.out.println("largest of "+i+" and "+k+" is "+p);
	int s=(i<k)?i:k;
	System.out.println("smallest of "+i+" and "+k+" is "+s);
	int m=9,n=3,l=2;
	int lar=(m>n && m>1)?m:(n>m && n>1)?n:1;
	System.out.println("largest of 3 no is " +lar);
	


	}

}
