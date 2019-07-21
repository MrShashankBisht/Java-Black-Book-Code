import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<APPLET
CODE=border.class
WIDTH=200
HEIGHT=200 >
</APPLET>
*/
class textPanel extends Panel
{
TextField Text1;
textPanel(){
Text1 = new TextField(30);
add(Text1);
}
}

public class border extends Applet implements ActionListener
{
Button button1, button2, button3, button4;
textPanel Panel1;
public void init()
{
setLayout(new BorderLayout());
button1 = new Button("1");
add("North", button1);
button1.addActionListener(this);
button2 = new Button("2");
add("West", button2);
button2.addActionListener(this);
button3 = new Button("3");
add("South", button3);
button3.addActionListener(this);
button4 = new Button("4");
add("East", button4);
button4.addActionListener(this);
Panel1 = new textPanel();
add("Center", Panel1);
Panel1.Text1.setLocation(0, 0);
}
public void actionPerformed(ActionEvent e)
{
Panel1.Text1.setText("Button " +
((Button) e.getSource()).getLabel() + " clicked.");
}
}

