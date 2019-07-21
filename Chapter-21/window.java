import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/* <APPLET
CODE = window.class
WIDTH = 350
HEIGHT = 280 >
</APPLET>
*/
public class window extends JApplet implements ActionListener
{
JWindow jwindow = new JWindow();
public void init()
{
Container contentPane = getContentPane();
JButton jbutton = new JButton("Display window");
JButton jwindowbutton = new JButton("Close");
contentPane.setLayout(new FlowLayout());
contentPane.add(jbutton);
jwindow.getRootPane().setBorder(
BorderFactory.createRaisedBevelBorder()
);
Container windowContentPane = jwindow.getContentPane();
windowContentPane.setLayout(new FlowLayout());
windowContentPane.add(jwindowbutton);
jwindowbutton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{
jwindow.dispose();
}
});
jbutton.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
jwindow.setBounds(200, 200, 100, 100);
jwindow.setVisible(true);}
}
