import java.awt.*;
import javax.swing.*;
/*
<APPLET
CODE = separator.class
WIDTH = 400
HEIGHT = 200 >
</APPLET>
*/
public class separator extends JApplet
{
JSeparator jseparator = new JSeparator(JSeparator.VERTICAL);
Dimension dimension = jseparator.getPreferredSize();
public void init()
{
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
contentPane.add(new JTextField("Hello from Swing!"));
contentPane.add(jseparator);
contentPane.add(new JTextField("Hello from Swing!"));
jseparator.setPreferredSize(new Dimension(dimension.width, 100));
}
}
