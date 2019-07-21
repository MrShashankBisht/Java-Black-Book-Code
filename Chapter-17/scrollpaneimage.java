import java.awt.*;
import javax.swing.*;
/*
<APPLET
CODE=scrollpaneimage.class
WIDTH=300
HEIGHT=200 >
</APPLET>
*/
public class scrollpaneimage extends JApplet
{
public scrollpaneimage()
{
Container contentPane = getContentPane();
JLabel jlabel = new JLabel(new ImageIcon("bulg.jpg"));
JScrollPane jscrollpane = new JScrollPane(jlabel);
contentPane.add(jscrollpane);
}
}
