import java.util.*;
class test
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of strings:");
		int n=s.nextInt();
		String arr[]=new String[n];
		System.out.println("enter strings:");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.next();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
					String temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}


