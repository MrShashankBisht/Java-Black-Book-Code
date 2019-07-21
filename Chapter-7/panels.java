import java.applet.Applet;
import java.awt.*;
/*
<APPLET
CODE=panels.class
WIDTH=200
HEIGHT=200 >
</APPLET>
*/

class buttonpanel extends Panel
{
Button button1, button2, button3, button4;
buttonpanel()
{
button1 = new Button("1");
add(button1);
button2 = new Button("2");
add(button2);
button3 = new Button("3");
add(button3);
button4 = new Button("4");
add(button4);
}
}


public class panels extends Applet {
buttonpanel panel1, panel2, panel3, panel4, panel5, panel6;
public void init()
{
setLayout(new GridLayout(3, 3));
Button b1;
b1 = new Button(" ");
Panel panel7;
panel1 = new buttonpanel();
panel2 = new buttonpanel();
panel3 = new buttonpanel();
panel4 = new buttonpanel();
panel5 = new buttonpanel();
panel6 = new buttonpanel();
panel7 = new Panel();
add(panel1);
add(panel2);
add(panel3);
add(panel4);
add(panel5);
add(panel6);
add(panel7);
panel7.add(b1);
panel7.getAccessibleContext().setAccessibleName("Seventh");
String  tip = panel7.getAccessibleContext().getAccessibleName();
b1.setLabel(tip);
}
}
