import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/* <APPLET
CODE=toggle.class
WIDTH=450
HEIGHT=450 >
</APPLET>*/
public class toggle extends JApplet {
public toggle() {
Container contentPane = getContentPane();
Icon icon = new ImageIcon("toggle.jpg");
JToggleButton toggle1 = new JToggleButton(icon);
JToggleButton toggle2 = new JToggleButton(icon, true);
JToggleButton toggle3 = new JToggleButton("Toggle Me!");
JToggleButton toggle4 = new JToggleButton("Toggle Me!", icon);
JToggleButton toggle5 = new JToggleButton("Toggle Me!", icon,
true);
contentPane.setLayout(new FlowLayout());
contentPane.add(toggle1);
contentPane.add(toggle2);
contentPane.add(toggle3);
contentPane.add(toggle4);
contentPane.add(toggle5);
}
}
