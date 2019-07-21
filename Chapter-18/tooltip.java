import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<APPLET
CODE=tooltip.class
WIDTH=300
HEIGHT=200 >
</APPLET>
*/
public class tooltip extends JApplet
{
JButton button = new JButton("Click Me");
JTextField text = new JTextField(20);
public void init()
{
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
button.setToolTipText("This is a button.");
contentPane.add(button);
contentPane.add(text);
button.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent event) {
text.setText("Hello from Swing!");
}
});
}
}
