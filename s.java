class box
{
	double width;
	double height;
	double depth;
	box(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
}
class boxweight extends box
{
	double weight;
	boxweight(double w,double h,double d,double m)
	{
		super(w,h,d);
		weight=m;
	}
	double vol()
	{
		return width*height*depth;
	}
	
}
class s{
	public static void main(String args[])
	{
		boxweight b=new boxweight(1,2,3,4);
		double a=b.vol();
		System.out.println("volume is:"+a);
	}
}	