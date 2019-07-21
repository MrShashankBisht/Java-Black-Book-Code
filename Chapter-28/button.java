package sunw.demo.button;
import java.awt.*;
import java.awt.event.*;

public class button extends Panel implements ActionListener
{
    int count;
    Button button1;

    public button() 
    {
        count = 0;
        setSize(200, 100);

        button1 = new Button("Click me");
 
        button1.addActionListener(this);

        add(button1);
    }

    public void actionPerformed(ActionEvent e) 
    {
        count++;
        repaint();
    }

    public void paint(Graphics g) 
    {
        Dimension d = getSize();
        int h = d.height;
        int w = d.width;
        g.setColor(new Color(255, 0, 0));
        g.fillRect(0, 0, w-1, h-1);

        g.setColor(new Color(0, 0, 0));
        g.drawString("Click count = " + count, 50, 50);
    }
}
