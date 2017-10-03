import java.util.*;
class oop
{
	int a;
	int b;
	void sub()
	{
		int sum=a+b;
		System.out.println(sum);
	}
}
class java extends oop
{
	int c;
	int d;
	void add()
	{
		
		int sum=c+d;
		System.out.println(sum);
		
	}
}
class tr extends java
{
	int e;
	int f;
	void add()
	{
		super.add();
		int sum=e+f;
		System.out.println(sum);
	}
}
class abs
{
	public static void main(String args[])
	{
		tr t=new tr();
		t.a=1;
		t.b=2;
		t.c=3;
		t.d=4;
		t.e=5;
		t.f=6;
		t.add();
		t.sub();
	}
}


