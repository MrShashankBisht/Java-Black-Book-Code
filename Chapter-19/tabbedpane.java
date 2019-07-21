import java.awt.*;
import javax.swing.*;
/*
<APPLET
CODE = tabbedpane.class
WIDTH = 550
HEIGHT = 200 >
</APPLET>
*/
public class tabbedpane extends JApplet
{
public void init()
{
Container contentPane = getContentPane();
JTabbedPane jtabbedpane = new JTabbedPane();
JPanel jpanel1 = new JPanel();
JPanel jpanel2 = new JPanel();
JPanel jpanel3 = new JPanel();
jpanel1.add(new JLabel("This is panel 1"));
jpanel2.add(new JLabel("This is panel 2"));
jpanel3.add(new JLabel("This is panel 3"));
jtabbedpane.addTab("Tab 1",
new ImageIcon("tabb.jpg"),
jpanel1, "This is tab 1");
jtabbedpane.addTab("Tab 2",
new ImageIcon("tabb.jpg"),
jpanel2, "This is tab 2");
jtabbedpane.addTab("Tab three",
new ImageIcon("tabb.jpg"),
jpanel3, "This is tab 3");
contentPane.setLayout(new BorderLayout());
contentPane.add(jtabbedpane);
}
}
