import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/* <APPLET
CODE = dialogconfirm.class
WIDTH = 350
HEIGHT = 280>
</APPLET>
*/
public class dialogconfirm extends JApplet
{
JWindow jwindow = new JWindow();
public void init()
{
final Container contentPane = getContentPane();
JButton jbutton = new JButton("Display dialog");
contentPane.setLayout(new FlowLayout());
contentPane.add(jbutton);
jbutton.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
int result = JOptionPane.showConfirmDialog((Component)
null, "Choose yes or no", "Choose yes or no",
JOptionPane.YES_NO_OPTION);
if (result == JOptionPane.YES_OPTION) {
showStatus("You clicked yes.");
} else {
showStatus("You clicked no.");
}
}
});
}
}
