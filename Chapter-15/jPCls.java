import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class jPCls extends JFrame {
jpanel j;
public jPCls() {
super("Swing application");
Container contentPane = getContentPane();
j = new jpanel();
contentPane.add(j);
}
public static void main(String args[]) {
final JFrame f = new jPCls();
f.setBounds(100, 100, 300, 300);
f.setVisible(true);
f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
f.addWindowListener(new WindowAdapter() {
public void windowClosed(WindowEvent e) {
System.exit(0);
}
});
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
g.drawString("This is the solution!", 90, 120);
g.drawString("\"Closing me ends the application as well\"", 35, 150);
}
}
