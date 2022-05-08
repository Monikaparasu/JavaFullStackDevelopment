package p1;
class AdditionConstructor {//object
int i,j;
AdditionConstructor()//constructor
{
	System.out.println("Constructor is a special type of function");
	System.out.println("No return type");
    System.out.println("Calls automatically on object creation");
    System.out.println("Name of the constructor should be the name of the class");
    i=5;
    j=9;
}
void display()
{
	System.out.println("Display");
}
}