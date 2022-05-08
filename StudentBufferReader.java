package p1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class School
{
	String sname;
	int sid;
	float samount;
	String slocation;

void input() throws IOException
{
	InputStreamReader is=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(is);
	
	System.out.println(" Enter school name");
	sname=br.readLine();
	
    System.out.println("enter school id");
    sid=Integer.parseInt(br.readLine());
    
    System.out.println("enter school fees");
    samount=Float.parseFloat(br.readLine());
    
    System.out.println("ente school location");
    slocation=br.readLine();
}
void display()
{
	System.out.println("name "+sname);
	System.out.println("id "+sid);
	System.out.println("amount"+samount);
	System.out.println("location "+slocation);
}
public class StudentBufferReader {

	public static void main(String[] args)throws IOException
	{
		School ob=new School();
		ob.input();
		ob.display();

	}

}
}