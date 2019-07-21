import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<APPLET
CODE = dialog.class
WIDTH = 350
HEIGHT = 280>
</APPLET>
*/
public class dialog extends JApplet implements ActionListener
{
JLabel jlabel = new JLabel("Click the OK or Cancel button");
JButton jbutton1 = new JButton("Display dialog"),
jbutton2 = new JButton("OK"),
jbutton3 = new JButton("Cancel");
private JDialog dialog = new JDialog((Frame) null,
"Dialog", true);
public void init()
{
Container contentPane = getContentPane();
Container dialogContentPane = dialog.getContentPane();
contentPane.setLayout(new FlowLayout());
contentPane.add(jbutton1);
dialogContentPane.setLayout(new FlowLayout());
dialogContentPane.add(jlabel);
dialogContentPane.add(jbutton2);
dialogContentPane.add(jbutton3);
jbutton1.addActionListener(this);
jbutton2.addActionListener(this);
jbutton3.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource() == jbutton1) {
dialog.setBounds(200, 200, 200, 120);
dialog.setVisible(true);
} else if(e.getSource() == jbutton2) {
showStatus("You clicked OK");
dialog.dispose();
} else if(e.getSource() == jbutton3) {
showStatus("You clicked Cancel");
dialog.dispose();
}
}
}

