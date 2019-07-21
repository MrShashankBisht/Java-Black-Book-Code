import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class jframe extends JFrame
{
jpanel j;
public jframe()
{
super("Swing application");
Container contentPane = getContentPane();
j = new jpanel();
contentPane.add(j);
}
public static void main(String args[])
{
final JFrame f = new jframe();
f.setBounds(100, 100, 300, 300);
f.setVisible(true);
f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
f.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
System.exit(0);
}
});
}
}
class jpanel extends JPanel
{
JTextField jtextfield = new JTextField("Hello from Swing!");
jpanel()
{
setBackground(Color.white);
add(jtextfield);
}
public void paintComponent (Graphics g)
{
super.paintComponent(g);
g.drawString("Hello from Swing!", 0, 60);
}
}
