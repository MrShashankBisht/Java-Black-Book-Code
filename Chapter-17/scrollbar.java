import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<APPLET
CODE=scrollbar.class
WIDTH=300
HEIGHT=200 >
</APPLET>
*/
public class scrollbar extends JApplet
{
private JScrollBar vsb = new JScrollBar(JScrollBar.VERTICAL, 0,
0, 0, 180);
private jpanel j = new jpanel();
public void init()
{
Container contentPane = getContentPane();
contentPane.add(j, BorderLayout.CENTER);
contentPane.add(vsb, BorderLayout.EAST);
vsb.addAdjustmentListener(new AdjustmentListener()
{
public void adjustmentValueChanged(AdjustmentEvent e) {
JScrollBar sb = (JScrollBar)e.getSource();
j.setScrolledPosition(e.getValue());
j.repaint();
}
});
}
}
class jpanel extends JPanel
{
	JLabel jlabel = new JLabel("Hello from Swing!");
	int y = 0;
	jpanel()
	{
		jlabel = new JLabel("Hello from Swing!");
		add(jlabel);
	}
public void paintComponent(Graphics g)
{
super.paintComponent(g);
jlabel.setLocation(0, y);
}
public void setScrolledPosition(int newposition)
{
y = newposition;
}
}
