import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
/*
<APPLET
CODE=fill_slider.class
WIDTH=300
HEIGHT=200 >
</APPLET>
*/
public class fill_slider extends JApplet implements ChangeListener
{
JSlider jslider = new JSlider(SwingConstants.HORIZONTAL, 0, 100, 0);
public void init()
{
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
jslider.addChangeListener(this);
jslider.putClientProperty("JSlider.isFilled", Boolean.TRUE);
contentPane.add(jslider);
}
public void stateChanged(ChangeEvent e)
{
JSlider jslider1 = (JSlider) e.getSource();
showStatus("Slider minimum: " + jslider1.getMinimum() +
", maximum: " + jslider1.getMaximum() +
", value: " + jslider1.getValue());
}
}
