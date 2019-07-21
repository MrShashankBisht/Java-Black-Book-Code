import java.net.URL;
import java.sql.*;

class preStatementApp
{
	public static void main(String argv[]) {
		try {

	String url = "jdbc:odbc:msaccessdb";
	Connection con = DriverManager.getConnection(url, "", "");
	PreparedStatement preSmnt = con.prepareStatement(
				"UPDATE Table1 SET a = ? WHERE key = ?");
			preSmnt.setInt(1, 34);
			preSmnt.setString(2, "count");
			preSmnt.executeUpdate();
			System.out.println("Updated \"count\" row OK.");
			preSmnt.setString(2, "mirror");
			preSmnt.executeUpdate();
			System.out.println("Updated \"mirror\" row OK.");
			preSmnt.close();
			con.close();
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
		}
	}
}
