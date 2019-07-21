// Demonstrate BorderLayout.
import java.awt.*;
import java.applet.*;
import java.util.*;
/*
<applet code="BordLay" width=400 height=200>
</applet>
*/

public class BordLay extends Applet {
  public void init() {
    setLayout(new BorderLayout());

    add(new Button("Top part"),
        BorderLayout.NORTH);
    add(new Label("Bottom part"),
        BorderLayout.SOUTH);
    add(new Button("Right-hand side"), BorderLayout.EAST);
    add(new Button("Left-hand side"), BorderLayout.WEST);

    String msg = "The secret of health " +
		"for both mind and body \n"+
		"is not to mourn for the \n"+
		"past, not to worry about \n"+
		"the future, not to anticipate \n"+
		"troubles, but to live the \n"+
		"present moment wisely and \n"+
		"earnestly. \n\n"+
		"[Siddhartha Gautama, 563 - 483 BC] \n\n";
    add(new TextArea(msg), BorderLayout.CENTER);
  }
}