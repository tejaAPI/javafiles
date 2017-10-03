import java.sql.*;
import java.util.*;
class dat
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int i;
		String stname,stadd,stno;
		float stper;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vignan","root","vuit");
			i=1;
			while(i<=10)
			{
				PreparedStatement stmt=con.prepareStatement("(?,?,?,?)");
				System.out.println("enter name:");
				stname=s.nextLine();
				System.out.println("enter student number:");
				stno=s.nextLine();
				System.out.println("enter the per:");
				stper=Float.parseFloat(s.nextLine());
				System.out.println("enter student address:");
				stadd=s.nextLine();
				stmt.setString(1,stno);
				stmt.setString(2,stname);
				stmt.setFloat(3,stper);
				stmt.setString(4,stadd);
				stmt.execute();
				i++;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}//end of main
}
				
				