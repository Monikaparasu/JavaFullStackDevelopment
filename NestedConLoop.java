package p1;

public class NestedConLoop {

	public static void main(String[] args) {
		
			for(int i=1;i<=5;i++)
			{
				
				for(int j=1;j<=5;j++)
				{
					if(j==2)
				{
						continue  ;
				}
		System.out.print(" i= "+i+ " j= " +j);
				}
				}
}
}