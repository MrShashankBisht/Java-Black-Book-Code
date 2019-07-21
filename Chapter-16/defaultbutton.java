import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/* <APPLET
CODE=defaultbutton.class
WIDTH=300
HEIGHT=200 >
</APPLET>*/
public class defaultbutton extends JApplet {
JButton button1 = new JButton("Click Me");
JButton button2 = new JButton("Click Me");
JTextField text = new JTextField(20);
public void init()
{
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
button2.setMnemonic('C');
getRootPane().setDefaultButton(button2);
contentPane.add(button1);
contentPane.add(button2);
contentPane.add(text);
getRootPane().requestFocus();
button1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent event)
{
text.setText("Hello from Swing!");
}
});
button2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent event)

{
text.setText("Hello from Swing!");
}
});
}
}
