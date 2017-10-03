class teja
{
	void eating()
	{
		System.out.println("always eatingg.....");
	}
	
}
class b extends teja
{
	void eating()
	{
		System.out.println("eating cookies....");
	}
	void work()
	{
		super.eating();
		eating();
	}
}
class met
{
	public static void main(String args[])
	{
		b t=new b();
		t.work();
	}
}
	