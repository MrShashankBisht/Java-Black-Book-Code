import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<APPLET
CODE = colorchooser.class
WIDTH = 200
HEIGHT = 200 >
</APPLET>
*/
public class colorchooser extends JApplet implements ActionListener
{
JPanel jpanel = new JPanel();
JButton jbutton;
public void init()
{
jbutton = new JButton("Click here to change colors.");
jbutton.addActionListener(this);
jpanel.add(jbutton);
getContentPane().add(jpanel);
}
public void actionPerformed(ActionEvent e)
{
Color color = JColorChooser.showDialog(colorchooser.this,
"Select a new color...", Color.white);
jpanel.setBackground(color);
}
}
