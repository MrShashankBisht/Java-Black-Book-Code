import java.awt.*;
import javax.swing.*;
/*
<APPLET
CODE = overlay.class
WIDTH = 200
HEIGHT = 200 >
</APPLET>
*/
public class overlay extends JApplet
{
public void init()
{
Container contentPane = getContentPane();
JPanel jpanel = new JPanel();
jpanel.setLayout(new OverlayLayout(jpanel));
jpanel.setBackground(Color.white);
jpanel.setBorder(
BorderFactory.createTitledBorder(
BorderFactory.createEtchedBorder(),
"Overlays"));
JTextField text1 = new JTextField("Text 1");
JTextField text2 = new JTextField("Text 2");
text1.setMinimumSize(new Dimension(30, 30));
text2.setMinimumSize(new Dimension(30, 30));
text1.setPreferredSize(new Dimension(100, 100));
text2.setPreferredSize(new Dimension(100, 100));
text1.setMaximumSize(new Dimension(120, 120));
text2.setMaximumSize(new Dimension(120, 120));
text1.setAlignmentX(0.2f);
text1.setAlignmentY(0.2f);
text2.setAlignmentX(0.8f);
text2.setAlignmentY(0.8f);
jpanel.add(text1);
jpanel.add(text2);
contentPane.setLayout(new FlowLayout());
contentPane.add(jpanel);
}
}
