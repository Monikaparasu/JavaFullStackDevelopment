package p1;
class Volume
{
	double b,h,l,r;
}

public class VolumeFunction {
	double volume (double r)
	{
		double volume=(4/3.0)*(22/7)*r*r*r;
		System.out.println("sphere volume ="+r);
		return volume;
	}
	double volume(double h,double r)
	{
		double volume= (22/7)*r*r*h;
		System.out.println("cylinder volume="+h +r);
		return volume;
	}
	double volume(double l,double b,double h)
	{
		double volume=(l*b*h);
		System.out.println("cuboid volume="+l +b +h);
		return volume;
	}
	public static void main(String[] args) {
		VolumeFunction ob= new VolumeFunction();
		ob.volume(4);//r
		ob.volume(8,5.4);//r,h
		ob.volume(6,4.1,2.1);//l,b,h

	}

}
