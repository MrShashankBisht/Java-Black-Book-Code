import java.sql.*;
import java.io.*;
class Select1 {
public static void main( String argv[] ) {
try {

String url = "jdbc:odbc:msaccessdb";
Connection con = DriverManager.getConnection (url, "",
"");
String qs = "select * from emp";
Statement smnt = con.createStatement( );
ResultSet res = smnt.executeQuery( qs );
boolean more = res.next();
while ( more ) {
System.out.println( "Col1: " +
res.getInt( "salary" ) );
more = res.next();
}
}
catch (java.lang.Exception ex) {
System.out.println( "** Error on data select. ** " );
ex.printStackTrace ();
}
}
}
