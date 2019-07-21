import java.awt.*;
import javax.swing.*;
/*
<APPLET
CODE=scrollpane.class
WIDTH=300
HEIGHT=200 >
</APPLET>
*/
public class scrollpane extends JApplet
{
public void init()
{
Container contentPane = getContentPane();
JPanel jpanel = new JPanel();
jpanel.setLayout(new GridLayout(11, 16));
for(int outer = 0; outer <= 10; outer++) {
for(int inner = 0; inner <= 15; inner++) {
jpanel.add(new JTextField("Text Field " + outer +
", " + inner));
}
}
JScrollPane jscrollpane = new JScrollPane(jpanel,
ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
contentPane.add(jscrollpane);
}
}
