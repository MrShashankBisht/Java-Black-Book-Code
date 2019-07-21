import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/* <APPLET
CODE=togglegroup.class
WIDTH=300
HEIGHT=520 >
</APPLET>*/
public class togglegroup extends JApplet {
public togglegroup() {
Container contentPane = getContentPane();
ButtonGroup group = new ButtonGroup();
JToggleButton[] buttons = new JToggleButton[] {
new JToggleButton(new ImageIcon("toggle.jpg")),
new JToggleButton(new ImageIcon("toggle.jpg")),
new JToggleButton(new ImageIcon("toggle.jpg")),
new JToggleButton(new ImageIcon("toggle.jpg")),
new JToggleButton(new ImageIcon("toggle.jpg"))
};
contentPane.setLayout(new FlowLayout());
for(int i=0; i < buttons.length; ++i) {
group.add(buttons[i]);
contentPane.add(buttons[i]);
}
}
}
