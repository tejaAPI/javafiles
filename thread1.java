

class A extends Thread
{
	public void run()
	{
		try{
			for(int i=1;i<=5;i++)
			{
				System.out.println("A -"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
		}
	}
}
class B extends Thread
{
	public void run()
	{
		try{
			for(int i=1;i<=5;i++)
			{
				System.out.println("B -"+i);
				Thread.sleep(1000);
				
			}
		}
		catch(InterruptedException ie)
		{
		}
	}
}
class thread1 
{
	public static void main(String args[])
	{
		A a=new A();
		B b=new B();
		a.start();
		b.start();
	}
}
