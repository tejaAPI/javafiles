import java.util.*;
class email
{
	public static void main(String args[])
	{
		String s;
		int f=0,i;
		Scanner a=new Scanner(System.in);
		System.out.println("enter your email address:");
		s=a.next();
	
				try
				{
				
				for(i=0;i<s.length();i++)
				{
					if(s.charAt(i)=='@')
					{
						f=1;
						break;
					}
				}
		
				if(f==1)
				{
					System.out.println("valid email address");
				}	
				else
				{
					throw new InvalidEmailIdException("demo");
				}
				}
					
				catch(InvalidEmailIdException e)
				{
					System.out.println(e);
				}
		
		
	}
}