import java.awt.*;
import javax.swing.*;
/* <APPLET
CODE=plafcomponent.class
WIDTH=210
HEIGHT=200 >
</APPLET> */
public class plafcomponent extends JApplet {
public void init() {
Container contentPane = getContentPane();
JNewLabel jnewlabel = new JNewLabel(
"This is a fake label.");
contentPane.setLayout(new FlowLayout());
contentPane.add(new JLabel("This is a real label."));
contentPane.add(jnewlabel);
}
}
class JNewLabel extends JTextField {
public JNewLabel(String s) {
super(s);
}
public void updateUI() {
super.updateUI();
setHighlighter(null);
setEditable(false);
LookAndFeel.installBorder(this, "Label.border");
LookAndFeel.installColorsAndFont(this, "Label.background",
"Label.foreground", "Label.font");
}
}
