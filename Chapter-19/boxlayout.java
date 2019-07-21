import java.awt.*;
import javax.swing.*;
/* <APPLET
CODE = boxlayout.class
WIDTH = 250
HEIGHT = 200 >
</APPLET>
*/
public class boxlayout extends JApplet
{
public void init()
{
Container contentPane = getContentPane();
JPanel jpanel1, jpanel2, jpanel3;
jpanel1 = new JPanel();
jpanel2 = new JPanel();
jpanel3 = new JPanel();
jpanel1.setLayout(new BoxLayout(jpanel1, BoxLayout.Y_AXIS));
jpanel2.setLayout(new BoxLayout(jpanel2, BoxLayout.X_AXIS));
jpanel3.setLayout(new BoxLayout(jpanel3, BoxLayout.Y_AXIS));
contentPane.setLayout(new FlowLayout());
jpanel1.add(new JTextField("Text 1"));
jpanel1.add(new JTextField("Text 2"));
jpanel1.add(new JTextField("Text 3"));
jpanel1.add(new JTextField("Text 4"));
jpanel2.add(new JTextField("Text 1"));
jpanel2.add(new JTextField("Text 2"));
jpanel2.add(new JTextField("Text 3"));
jpanel2.add(new JTextField("Text 4"));
jpanel3.add(new JTextField("Text 1"));
jpanel3.add(new JTextField("Text 2"));
jpanel3.add(new JTextField("Text 3"));
jpanel3.add(new JTextField("Text 4"));
contentPane.add(jpanel1);
contentPane.add(jpanel2);
contentPane.add(jpanel3);
}
}
