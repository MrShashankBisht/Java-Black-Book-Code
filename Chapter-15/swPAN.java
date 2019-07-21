import java.awt.*;
import javax.swing.*;
/*
<APPLET
CODE=swPAN.class
WIDTH=300
HEIGHT=200 >
</APPLET>
*/
public class swPAN extends JApplet {
jpanel j;
public void init() {
Container contentPane = getContentPane();
j = new jpanel();
contentPane.add(j);
}
}
class jpanel extends JPanel {
jpanel() { setBackground(Color.white); }
public void paintComponent (Graphics g) {
super.paintComponent(g);
g.drawString("Hello from Swing!", 0, 60);
}
}
