import java.sql.*;

public class DemoJDBC 
{
	public static void main (String [] args) throws Exception
	{
		int count = 0;
		double payroll = 0.0; 
        ResultSet rslset1=null;

		String names; 
		double salaries; 
		Connection conn;
		String db = "jdbc:odbc:db1";
		String username = "";
		String password = "";
		conn = DriverManager.getConnection (db, username, password);
		System.out.println ("*** Connected to the database ***"); 

		Statement smnt = conn.createStatement ();

		 rslset1 = smnt.executeQuery ("select e.Name, e.Salary" + " " + 
			"from Emp e" + " " + 
			"where e.Dept = 'Toys' "); 


		System.out.println ( );		
		System.out.println ("Name      Salary");		
		System.out.println ("----      ------");		

		
		while(rslset1.next()) 
		{
			names = rslset1.getString (1); 
			salaries = rslset1.getInt ("Salary"); 
			System.out.println (names + "   " + salaries);
			count = count + 1; 
			payroll = payroll + salaries;
				
		}			

	    System.out.println ( ); 
		System.out.println ( );		
		System.out.println ("Number of employees in Toys Department " + count);
		System.out.println ("Total payroll for Toys Department " + payroll);

	
	    smnt.close (); 
		PreparedStatement stmt2 = conn.prepareStatement ("update emp"  + " " + 
			"set Dept=? , Salary=?" + " " + 
			"where Name = ? " ); 

		stmt2.setString(1,"Shoes");
		stmt2.setDouble(2,65000.0);
		stmt2.setString(3,"Hari");
		stmt2.executeUpdate();											  	                          
		stmt2.setString(1,"Credit");
		stmt2.setDouble(2,75000.0);
		stmt2.setString(3,"Leu");
		stmt2.executeUpdate();									                         
		stmt2.close (); 

		conn.commit();
		conn.close (); 
	}
} 
