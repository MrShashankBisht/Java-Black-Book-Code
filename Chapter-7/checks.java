import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<APPLET
CODE=checks.class
WIDTH=200
HEIGHT=200 >
</APPLET>
*/
public class checks extends Applet implements ItemListener {
Checkbox checkbox1, checkbox2, checkbox3, checkbox4;
TextField text1;
public void init()
{
checkbox1 = new Checkbox("1");
add(checkbox1);
checkbox1.addItemListener(this);
checkbox2 = new Checkbox("2");
add(checkbox2);
checkbox2.addItemListener(this);
checkbox3 = new Checkbox("3");
add(checkbox3);
checkbox3.addItemListener(this);
checkbox4 = new Checkbox("4");
add(checkbox4);
checkbox4.addItemListener(this);
text1 = new TextField(20);
add(text1);
}
public void itemStateChanged(ItemEvent e)
{
if(e.getItemSelectable() == checkbox1){
text1.setText("Check box 1 clicked!");
} else if(e.getItemSelectable() == checkbox2){
text1.setText("Check box 2 clicked!");
} else if(e.getItemSelectable() == checkbox3){
text1.setText("Check box 3 clicked!");
} else if(e.getItemSelectable() == checkbox4){
text1.setText("Check box 4 clicked!");
}
}
}