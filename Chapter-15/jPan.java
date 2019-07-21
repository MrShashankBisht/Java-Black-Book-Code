import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class jPan extends JFrame {
jpanel j;
public jPan() {
super("Swing application");
Container contentPane = getContentPane();
j = new jpanel();
contentPane.add(j);
}
public static void main(String args[]) {
final JFrame f = new jPan();
f.setBounds(100, 100, 300, 300);
f.setVisible(true);
}
}
class jpanel extends JPanel {
jpanel()
{
setBackground(Color.white);
}
public void paintComponent (Graphics g) {
super.paintComponent(g);
g.drawString("Swing using JPanel and JFrame!!", 50, 30);
g.drawString("There is a problem here!", 70, 120);
g.drawString("\"Closing me won't end the application\"", 35, 150);
}
}
