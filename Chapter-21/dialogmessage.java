import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<APPLET
CODE = dialogmessage.class
WIDTH = 350
HEIGHT = 280 >
</APPLET>
*/
public class dialogmessage extends JApplet implements ActionListener
{
JButton jbutton1 = new JButton("Display information dialog");
JButton jbutton2 = new JButton("Display error dialog");
JButton jbutton3 = new JButton("Display warning dialog");
JButton jbutton4 = new JButton("Display question dialog");
JButton jbutton5 = new JButton("Display plain dialog");
public void init()
{
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
contentPane.add(jbutton1);
contentPane.add(jbutton2);
contentPane.add(jbutton3);
contentPane.add(jbutton4);
contentPane.add(jbutton5);
jbutton1.addActionListener(this);
jbutton2.addActionListener(this);
jbutton3.addActionListener(this);
jbutton4.addActionListener(this);
jbutton5.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
String dialogtitle = "Dialog";
String dialogmessage = "Hello from Swing!";
int dialogtype = JOptionPane.PLAIN_MESSAGE;
if(e.getSource() == jbutton1) {
dialogtype = JOptionPane.INFORMATION_MESSAGE;
} else if(e.getSource() == jbutton2) {
dialogtype = JOptionPane.ERROR_MESSAGE;
} else if(e.getSource() == jbutton3) {
dialogtype = JOptionPane.WARNING_MESSAGE;
} else if(e.getSource() == jbutton4) {
dialogtype = JOptionPane.QUESTION_MESSAGE;
} else if(e.getSource() == jbutton5) {
dialogtype = JOptionPane.PLAIN_MESSAGE;
}
JOptionPane.showMessageDialog((Component) null,
dialogmessage, dialogtitle, dialogtype);
}
}
