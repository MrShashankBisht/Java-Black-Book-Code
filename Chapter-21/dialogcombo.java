import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<APPLET
CODE = dialogcombo.class
WIDTH = 350
HEIGHT = 280>
</APPLET>
*/
public class dialogcombo extends JApplet implements ActionListener
{
JButton jbutton = new JButton("Display dialog");
public void init()
{
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
contentPane.add(jbutton);
jbutton.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
String dialogtitle = "Dialog";
String dialogmessage = "Which one do you like best?";
String[] desserts = {
"cheesecake", "ice cream", "mousse", "carrot cake"
};
String dessert = (String)JOptionPane.showInputDialog(
dialogcombo.this, dialogmessage, dialogtitle,
JOptionPane.QUESTION_MESSAGE, null,
desserts, desserts[0]);
if(dessert == null)
showStatus("You clicked Cancel");
else
showStatus("Your favorite: " + dessert);
}
}
