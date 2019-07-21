package sunw.demo.bean2;
import java.awt.*;
import java.awt.event.*;

public class Bean2 extends Canvas 
{
    private boolean filled;
    int count;

    public Bean2() 
    {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) 
            {
                clicked();
            }
        });

        count = 0;
        filled = false;
        setSize(200, 100);
    }

    public void clicked()  
    {
        count++;
        repaint();
    }

    public boolean getfilled() 
    {
        return filled;
    }

    public void setfilled(boolean flag) 
    {
        this.filled = flag;
        repaint();
    }

    public void paint(Graphics g) 
    {
        Dimension dimension = getSize();
        int height = dimension.height;
        int width = dimension.width;

        if(filled){
            g.setColor(new Color(255, 0, 0));
            g.fillRect(0, 0, --width, --height);
        }

        g.setColor(new Color(0, 0, 0));
        g.drawString("Click count = " + count, 50, 50);
    }
}