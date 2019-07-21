package sunw.demo.bean;
import java.awt.*;
import java.awt.event.*;

public class bean extends Canvas 
{
    int count;

    public bean() 
    {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                clicked();
            }
        });
        count = 0;
        setSize(200, 100);
    }

    public void clicked()  
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
