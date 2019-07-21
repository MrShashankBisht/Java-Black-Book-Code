import java.util.*;
public class MyMessageDemo{

   static public void main(String[] args) {

      String language;
      String country;

      if (args.length != 2) {
          language = new String("en");
          country = new String("US");
      } else {
          language = new String(args[0]);
          country = new String(args[1]);
      }
      Locale locale= new Locale(language, country);

      ResourceBundle messages=ResourceBundle.getBundle("MessageBundle",locale);

      System.out.println(messages.getString("msg1"));
      System.out.println(messages.getString("msg2"));
      
   }
}
