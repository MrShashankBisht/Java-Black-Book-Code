import java.awt.*;
import javax.swing.*;
/* <APPLET
CODE = layered.class
WIDTH = 350
HEIGHT = 280 >
</APPLET>
*/
public class layered extends JApplet
{
JLabel labels[];
public void init()
{
Container contentPane = getContentPane();
contentPane.setLayout(null);
labels = new JLabel[6];
labels[0] = new JLabel("Label 0");
labels[0].setOpaque(true);
labels[0].setBorder(BorderFactory.createEtchedBorder());
contentPane.add(labels[0]);
labels[1] = new JLabel("Label 1");
labels[1].setOpaque(true);
labels[1].setBorder(BorderFactory.createEtchedBorder());
contentPane.add(labels[1]);
labels[2] = new JLabel("Label 2");
labels[2].setOpaque(true);
labels[2].setBorder(BorderFactory.createEtchedBorder());
contentPane.add(labels[2]);
labels[3] = new JLabel("Label 3");
labels[3].setOpaque(true);
labels[3].setBorder(BorderFactory.createEtchedBorder());
contentPane.add(labels[3]);
labels[4] = new JLabel("Label 4");
labels[4].setOpaque(true);
labels[4].setBorder(BorderFactory.createEtchedBorder());
contentPane.add(labels[4]);
labels[5] = new JLabel("Label 5");
labels[5].setOpaque(true);
labels[5].setBorder(BorderFactory.createEtchedBorder());
contentPane.add(labels[5]);
for(int loop_index = 0; loop_index < 6; loop_index++) {
labels[loop_index].setBounds(40 * loop_index, 40
* loop_index, 100, 60);
}
}
}
