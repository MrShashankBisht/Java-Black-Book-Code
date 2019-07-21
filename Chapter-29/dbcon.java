import java.sql.*;

public class dbcon
{
public static void main(String[] args)
{

try { 
     String db = "jdbc:odbc:db1"; 
      conn = DriverManager.getConnection (db, "","");
   System.out.println ("*** Connected to the database ***"); 
} 
catch (SQLException E) { 
   System.out.println ("SQLException: " + E.getMessage()); 
   System.out.println ("SQLState: " + E.getSQLState()); 
   System.out.println ("VendorError: " + E.getErrorCode()); 
} 
try { 
conn.commit(); 
conn.close (); 
} 
catch (SQLException E) {
   System.err.println ("Unable to load driver.");
   E.printStackTrace ();
} 
}
static Connection conn;
}
