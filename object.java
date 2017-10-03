class teja
{
	int a;
	int b;
	teja(int i,int j)
	{
		a=i;
		b=j;
	}

}
class bt extends teja
{
	int c;
	
	bt(int i,int j,int k)
		{
		super(i,j);
		c=k;
		}
	void sum()
	{
		
		int sum=a+b+c;
		System.out.println("sum="+sum);
	}
}
class object
{
	public static void main(String args[])
	{
		teja b=new teja(2,3);
		bt t=new bt();
		t.c=3;
		t.sum();
		
	}
}

		