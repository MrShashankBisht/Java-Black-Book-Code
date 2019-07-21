import java.awt.*;
import javax.swing.*;
/* <APPLET
CODE = layeredpane.class
WIDTH = 350
HEIGHT = 280 >
</APPLET>
*/
public class layeredpane extends JApplet
{
JLayeredPane jlayeredpane = new JLayeredPane();
JLabel labels[];
public void init()
{
setContentPane(jlayeredpane);
jlayeredpane.setLayout(null);
labels = new JLabel[6];
labels[0] = new JLabel("Content layer");
labels[0].setBorder(BorderFactory.createEtchedBorder());
jlayeredpane.setLayer(labels[0],
JLayeredPane.FRAME_CONTENT_LAYER.intValue());
jlayeredpane.add(labels[0]);
labels[1] = new JLabel("Default layer");
labels[1].setBorder(BorderFactory.createEtchedBorder());
jlayeredpane.setLayer(labels[1],
JLayeredPane.DEFAULT_LAYER.intValue());
jlayeredpane.add(labels[1]);
labels[2] = new JLabel("Palette layer");
labels[2].setBorder(BorderFactory.createEtchedBorder());
jlayeredpane.setLayer(labels[2],
JLayeredPane.PALETTE_LAYER.intValue());
jlayeredpane.add(labels[2]);
labels[3] = new JLabel("Modal layer");
labels[3].setBorder(BorderFactory.createEtchedBorder());
jlayeredpane.setLayer(labels[3],
JLayeredPane.MODAL_LAYER.intValue());
jlayeredpane.add(labels[3]);
labels[4] = new JLabel("Popup layer");
labels[4].setBorder(BorderFactory.createEtchedBorder());
jlayeredpane.setLayer(labels[4],
JLayeredPane.POPUP_LAYER.intValue());
jlayeredpane.add(labels[4]);
labels[5] = new JLabel("Drag layer");
labels[5].setBorder(BorderFactory.createEtchedBorder());
jlayeredpane.setLayer(labels[5],
JLayeredPane.DRAG_LAYER.intValue());
jlayeredpane.add(labels[5]);
for(int loop_index = 0; loop_index < 6; loop_index++) {
labels[loop_index].setBounds(40 * loop_index, 40 *
loop_index, 100, 60);
}
}
}
