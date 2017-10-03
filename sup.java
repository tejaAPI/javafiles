class a
{
	int b=2;
	
}
class b extends a
{
	int b=3;
	void met()
	{
		System.out.println(b);
		System.out.println(super.b);
	}
}
class sup
{
	public static void main(String args[])
	{
			a c=new a();
			b q=new b();
			q.met();
	}
}

