import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<APPLET
CODE = optionpaneinternal.class
WIDTH = 350
HEIGHT = 280 >
</APPLET>
*/
public class optionpaneinternal extends JApplet implements ActionListener
{
private JButton jbutton = new JButton("Display internal dialog");
JDesktopPane jdesktoppane = new JDesktopPane();
public void init()
{
Container contentPane = getContentPane();
contentPane.add(jbutton, BorderLayout.SOUTH);
contentPane.add(jdesktoppane);
jbutton.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
JOptionPane.showInternalMessageDialog(
jdesktoppane, "Hello from Swing!", "Dialog",
JOptionPane.INFORMATION_MESSAGE);
}
}
