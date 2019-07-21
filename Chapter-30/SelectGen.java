import java.sql.*;
import java.io.*;
class SelectGen {
public static void main( String argv[] ) {
try {
String url = "jdbc:odbc:msaccessdb";
Connection con = DriverManager.getConnection (
url, "", "");
String tableName = "emp1";
if ( argv.length > 0 )
tableName = argv[0];
String qs = "select * from " + tableName;
Statement smnt = con.createStatement();
ResultSet res = smnt.executeQuery( qs );
ResultSetMetaData rsmd = res.getMetaData();
int n = 0;
boolean more = res.next();
while ( more ) {
for ( n = 1; n <= rsmd.getColumnCount(); n++ ) {
System.out.println( "Col " + n +
" Name: " +
rsmd.getColumnName( n ) +
" value: " +
res.getString( n )
);
}
}
}
catch (java.lang.Exception ex) {
System.out.println( "** Error on data select. ** " );
ex.printStackTrace ();
}
}
}
