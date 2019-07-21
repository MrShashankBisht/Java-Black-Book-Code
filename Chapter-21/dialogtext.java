import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<APPLET
CODE = dialogtext.class
WIDTH = 350
HEIGHT = 280>
</APPLET>
*/
public class dialogtext extends JApplet implements ActionListener
{
JButton jbutton = new JButton("Display dialog");
String message = "Enter the text";
public void init()
{
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
contentPane.add(jbutton);
jbutton.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
String result = JOptionPane.showInputDialog(message);
if(result == null)
showStatus("You clicked Cancel");
else
showStatus("You typed: " + result);
}
}
