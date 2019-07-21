import java.awt.*;
import javax.swing.*;
/*
<APPLET
CODE=scrollpane1.class
WIDTH=300
HEIGHT=200 >
</APPLET>
*/
public class scrollpane1 extends JApplet
{
public void init()
{
Container contentPane = getContentPane();
contentPane.setLayout(new BorderLayout());
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
JLabel jlabel1 = new JLabel("Horizontal label");
JLabel jlabel2 = new JLabel("Vertical label");

jscrollpane.setColumnHeaderView(jlabel1);
jscrollpane.setRowHeaderView(jlabel2);
jscrollpane.setViewportBorder(BorderFactory.createEtchedBorder());
contentPane.add(jscrollpane);
}
}
