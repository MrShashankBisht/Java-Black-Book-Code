import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
/*
<APPLET
CODE=slider_extend.class
WIDTH=400
HEIGHT=200 >
</APPLET>
*/

public class slider_extend extends JApplet implements ActionListener,
ChangeListener
{
JSlider jslider = new JSlider(SwingConstants.HORIZONTAL, 0, 100, 0);


JButton jbutton = new JButton("Set extent to 60");
public void init()
{
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
jslider.addChangeListener(this);
jslider.putClientProperty("JSlider.isFilled", Boolean.TRUE);
jslider.setPaintTicks(true);
jslider.setPaintLabels(true);
jslider.setMajorTickSpacing(20);
jslider.setMinorTickSpacing(10);
jslider.revalidate();
contentPane.add(jslider);
jbutton.addActionListener(this);
contentPane.add(jbutton);
}
public void stateChanged(ChangeEvent e)
{
JSlider jslider1 = (JSlider) e.getSource();
showStatus("Slider minimum: " + jslider1.getMinimum() +
", maximum: " + jslider1.getMaximum() +
", value: " + jslider1.getValue() +
", extent: " + jslider1.getExtent());
}
public void actionPerformed(ActionEvent e)
{
jslider.setValue(40);
jslider.setExtent(60);
jslider.revalidate();
}
}
