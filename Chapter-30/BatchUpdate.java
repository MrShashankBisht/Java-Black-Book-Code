import java.sql.*;

public class BatchUpdate {
    public static void main(String args[]) {
        String url = "jdbc:odbc:msaccessdb";
        Connection dbcon;
        Statement Smnt;

      

        try {
            dbcon = DriverManager.getConnection(url,"" ,"");
            Smnt = dbcon.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
            ResultSet.CONCUR_UPDATABLE);
            dbcon.setAutoCommit(false);
            Smnt.addBatch("INSERT INTO COFFEES " + "VALUES('Amaretto', 49, 9.99, 0, 0)");
            Smnt.addBatch("INSERT INTO COFFEES " + "VALUES('Hazelnut', 49, 9.99, 0, 0)");
            Smnt.addBatch("INSERT INTO COFFEES " + "VALUES('Amaretto_decaf', 49, 10.99, 0, 0)");
            Smnt.addBatch("INSERT INTO COFFEES " + "VALUES('Hazelnut_decaf', 49, 10.99, 0, 0)");
            int [] updateCounts = Smnt.executeBatch();
            ResultSet uprs = Smnt.executeQuery("SELECT * FROM COFFEES");
            System.out.println("Table COFFEES after insertion:");

            while (uprs.next()) {
                String name = uprs.getString("COF_NAME");
                int id = uprs.getInt("SUP_ID");
                float pricing = uprs.getFloat("PRICE");
                int sales = uprs.getInt("SALES");
                int total = uprs.getInt("TOTAL");
                System.out.print(name + " " + id + " " + pricing);
                System.out.println(" " + sales + " " + total);
            }
            uprs.close();
            Smnt.close();
            dbcon.close();

        } catch(BatchUpdateException b) {
            System.err.println("SQLException: " + b.getMessage());
            System.err.println("SQLState: " + b.getSQLState());
            System.err.println("Message: " + b.getMessage());
            System.err.println("Vendor: " + b.getErrorCode());
            System.err.print("Update counts: ");
            int [] updateCounts = b.getUpdateCounts();
            for (int i = 0; i < updateCounts.length; i++) {
                System.err.print(updateCounts[i] + " ");
            }

        } catch(SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
            System.err.println("SQLState: " + ex.getSQLState());
            System.err.println("Message: " + ex.getMessage());
            System.err.println("Vendor: " + ex.getErrorCode());
        }
    }
}
