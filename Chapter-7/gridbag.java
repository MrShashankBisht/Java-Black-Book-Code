import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<APPLET
CODE=gridbag.class
WIDTH=400
HEIGHT=80 >
</APPLET>
*/
public class gridbag extends Applet implements ActionListener
{
Button button1, button2, button3;
TextField text1;
public void init()
{
GridBagLayout gridbag = new GridBagLayout();
GridBagConstraints constraints = new GridBagConstraints();
setLayout(gridbag);
constraints.weighty = 1;
constraints.fill = GridBagConstraints.BOTH;
constraints.weightx = 1;
button1 = new Button("Button 1");
gridbag.setConstraints(button1, constraints);
button1.setActionCommand("button 1");
add(button1);
button1.addActionListener(this);
constraints.weightx = 2;
button2 = new Button("Button 2");
gridbag.setConstraints(button2, constraints);
button2.setActionCommand("button 2");
add(button2);
button2.addActionListener(this);
constraints.weightx = 1;
button3 = new Button("Button 3");
constraints.gridwidth = GridBagConstraints.REMAINDER;
gridbag.setConstraints(button3, constraints);
button3.setActionCommand("button 3");
add(button3);
button3.addActionListener(this);
text1 = new TextField();
constraints.gridwidth = GridBagConstraints.REMAINDER;
gridbag.setConstraints(text1, constraints);
add(text1);
}
public void actionPerformed(ActionEvent e)
{
text1.setText("You clicked " +
((Button) e.getSource()).getActionCommand());
}
}