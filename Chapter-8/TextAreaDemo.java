import java.awt.*;
import java.applet.*;
/*
<applet code="TextAreaDemo" width=300 height=250>
</applet>
*/

public class TextAreaDemo extends Applet {
  public void init() {
    String Artxt = 
      "Jack and Jill\n" +
      "went up the hill\n" +
      "to fetch a pail of water\n" +
      "Jack fell down\n" +
      "and broke his crown\n" +
      "and Jill came tumbling after";

    TextArea text = new TextArea(Artxt, 5, 20);
    add(text);
  }
}
