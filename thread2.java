

class A implements Runnable
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
class B implements Runnable
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
class thread2
{
	public static void main(String args[])
	{
		A a=new A();
		B b=new B();
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		t1.start();
		t2.start();
	}
}
