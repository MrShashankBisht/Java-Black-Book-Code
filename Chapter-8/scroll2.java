import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;

/*
<APPLET
    CODE=scroll2.class
    WIDTH=200
    HEIGHT=200 >
</APPLET>
*/


public class scroll2 extends Applet implements AdjustmentListener 
{
    Scrollbar scroll1, scroll2;
    int x = 0;

    public void init()
    {
        scroll1 = new Scrollbar(Scrollbar.HORIZONTAL, 1, 10, 1, 100);
        add(scroll1);
        scroll1.addAdjustmentListener(this);
    }

    public void paint(Graphics g)
    {
        g.drawString("Hello from Java!", x, 60);

    }

    public void adjustmentValueChanged(AdjustmentEvent e)
    {
        if(e.getAdjustable() == scroll1) {
            x = (int) (getSize().width * (float) scroll1.getValue() / 100);
            repaint();
        }
    }
}


