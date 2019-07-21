import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<APPLET
CODE=label.class
WIDTH=200
HEIGHT=200 >
</APPLET>
*/
public class label extends Applet
{
Label label1;
Label label2;
Label label3;
public void init()
{
label1 = new Label("Hello from Java!", Label.LEFT);
add(label1);
label2 = new Label("Hello from Java!", Label.CENTER);
add(label2);
label3 = new Label("Hello from Java!", Label.RIGHT);
add(label3);
}
}
