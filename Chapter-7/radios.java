import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<APPLET
CODE=radios.class
WIDTH=200
HEIGHT=200 >
</APPLET>
*/
public class radios extends Applet implements ItemListener {
CheckboxGroup radios;
Checkbox radio1, radio2, radio3, radio4;
TextField text1;
public void init()
{
radios = new CheckboxGroup();
radio1 = new Checkbox("1", false, radios);
add(radio1);
radio1.addItemListener(this);
radio2 = new Checkbox("2", false, radios);
add(radio2);
radio2.addItemListener(this);
radio3 = new Checkbox("3", false, radios);
add(radio3);
radio3.addItemListener(this);
radio4 = new Checkbox("4", false, radios);
add(radio4);
radio4.addItemListener(this);
text1 = new TextField(20);
add(text1);
}
public void itemStateChanged(ItemEvent e)
{
text1.setText("Radio button " +
((Checkbox) e.getItemSelectable()).getLabel() + " clicked!");
}
}
