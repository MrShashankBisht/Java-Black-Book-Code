import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*<APPLET
CODE=imagebutton.class
WIDTH=500
HEIGHT=200 >
</APPLET>*/
public class imagebutton extends JApplet {
JButton button = new JButton("Button", new ImageIcon("buttons.jpg"));
JTextField text = new JTextField(20);
public void init()
{
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
contentPane.add(button);
contentPane.add(text);
button.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent event) {
text.setText("Image on Buttons from Swing!");
}
});
}
}
