package p1;

public class LabelNestedLoopCon {

	public static void main(String[] args) {
		outer:
			for(int i=1;i<=5;i++)
			{
				inner:
				for(int j=1;j<=5;j++)
				{
					if(i==2)
				{
						continue inner ;
				}
		System.out.println(" i= "+i+ " j= " +j);
				}
			}
	}

}
