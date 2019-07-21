import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.io.*;
import java.sql.*;

public class SQLWarningApp {
  public static void main(String[] args) {
    SQLWarningApp warnApp = new SQLWarningApp();
    try {
      warnApp.doQuery();               
    } catch(SQLException sqle) {      
      do {                       
        System.err.println("Exception occurred:\nMessage: " + sqle.getMessage());
        System.err.println("SQL state: " + sqle.getSQLState());
        System.err.println("Vendor code: " + sqle.getErrorCode() +
                           "\n----------------");
      } while((sqle = sqle.getNextException()) != null);
    }
  }

  public void doQuery() throws SQLException {
    String url = "jdbc:odbc:msaccessdb";
    String jodriver = "sun.jdbc.odbc.JdbcOdbcDriver";
    String user = "guest";
    String pass = "guest";
    String querySmnt ="SELECT title, price FROM books WHERE price <> NULL";
    try {
      
      Connection connection = DriverManager.getConnection(url, user, pass);
      Statement querySmnt_books = connection.createStatement();
      ResultSet results = querySmnt_books.executeQuery(querySmnt);
      int pricing;
      String book_title;
      while(results.next()) {
        book_title = results.getString("title");
        checkForWarning(results.getWarnings());

        pricing = results.getInt("price");
        checkForWarning(results.getWarnings());

        System.out.println(book_title + " " + pricing);
      }
      querySmnt_books.close();
        } catch (SQLException sqle) {
      SQLException generatedException =
              new SQLException("SQL operation canceled","S1008", 0);
      SQLException lastException = sqle;
      while(lastException.getNextException() != null)
        lastException = lastException.getNextException();
      lastException.setNextException(generatedException);
      throw sqle;
    }
  }

  boolean checkForWarning(SQLWarning w) {
    if(w == null) {
      return false;
    }
    do {
      System.err.println("Warning:\nMessage: " + w.getMessage());
        System.err.println("SQL state: " + w.getSQLState());
        System.err.println("Vendor code: " + w.getErrorCode() +
                           "\n----------------");
    } while((w = w.getNextWarning())!=null);
    return true;
  }
}
