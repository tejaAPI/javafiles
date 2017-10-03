class a
{
	int i;
	int j;
	void setdim(int x,int y)
	{
		i=x;
		j=y;
	}
}
class b extends a
{
	int total;
	void sum()
	{
		System.out.println( i+","+j );
		total=i+j;
	}
}
class obj
{
	public static void main(String args[])
	{
		a sup=new a();
		b sob=new b();
		sob.setdim(2,3);
		sob.sum();
		System.out.println("sum="+sob.total);
	}
}
