import java.applet.Applet;
import java.awt.*;
/*
<APPLET
		CODE=flow.class
		WIDTH=400
		HEIGHT=200 >
</APPLET>
*/
public class flow extends Applet {
TextField text1, text2, text3;
public void init() {
setLayout(new FlowLayout(FlowLayout.RIGHT));
text1 = new TextField(10);
add(text1);
text2 = new TextField(10);
add(text2);
text3 = new TextField(10);
add(text3);
} 
}

