import java.awt.*;
import java.awt.event.*;
class AppFrame extends Frame
{
public void paint(Graphics g)
{
g.drawString("Hello from Java!", 60, 100);
}
}
public class applet15
{
public static void main(String [] args)
{
AppFrame f = new AppFrame();
f.setSize(200, 200);
f.addWindowListener(new WindowAdapter() {public void
windowClosing(WindowEvent e) {System.exit(0);}});
f.setVisible(true);
}
}

