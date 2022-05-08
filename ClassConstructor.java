package p1;


class Additioneg1{  //Object
	int i,j,s;
	Additioneg1(){ //Constructor with no arg
		System.out.println("Constructor is a special type of function");
		System.out.println("No return type");
		System.out.println("Calls automatically on object creation");
		System.out.println("Name of the constructor should be the name of the class");
		i=2;
		j=8;
	}

	Additioneg1(int k, int l){
		i=k;
		j=l;
		
	}
	void add() {
		
		s=i+j;
	}
	
	void disp() {
		System.out.println("Display ");
		System.out.println("The sum of "+i+" and "+j+" is "+s);
	}
}

public class ClassConstructor  {

	public static void main(String[] args) {


		//non parameterized constructor
				Additioneg1 ob=new Additioneg1(); //calls constructor
		          System.out.println("i="+ob.i);
		          System.out.println("j="+ob.j);
		          ob.add();
		          ob.disp();
		          
		          //parameterized constructor
		          
		          Additioneg1 ob1=new Additioneg1(15,67); 
		          System.out.println("i="+ob1.i);
		          System.out.println("j="+ob1.j);
		          ob1.add();
		          ob1.disp();
		          }
	}