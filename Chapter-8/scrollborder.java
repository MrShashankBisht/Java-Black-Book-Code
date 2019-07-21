import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
<APPLET
    CODE=scrollborder.class
    WIDTH=200
    HEIGHT=200 >
</APPLET>
*/

public class scrollborder extends Applet implements AdjustmentListener 
{

    Scrollbar hScroll1, hScroll2, vScroll1, vScroll2;
    textPanel t1;

    public void init()
    {
        setLayout(new BorderLayout());

        hScroll1 = new Scrollbar(Scrollbar.HORIZONTAL, 1, 1, 1, 100);
        add("North", hScroll1);
        hScroll1.addAdjustmentListener(this);

        vScroll1 = new Scrollbar(Scrollbar.VERTICAL, 1, 1, 1, 100); 
        add("West", vScroll1);
        vScroll1.addAdjustmentListener(this);

        hScroll2 = new Scrollbar(Scrollbar.HORIZONTAL, 1, 1, 1, 100);
        add("South", hScroll2);
        hScroll2.addAdjustmentListener(this);

        vScroll2 = new Scrollbar(Scrollbar.VERTICAL, 1, 1, 1, 100); 
        add("East", vScroll2);
        vScroll2.addAdjustmentListener(this);

        t1 = new textPanel();
        add("Center", t1);
    }

    public void adjustmentValueChanged(AdjustmentEvent e)
    {

        if(e.getAdjustable() == hScroll1){
            hScroll2.setValue(hScroll1.getValue());
        }
        if(e.getAdjustable() == vScroll1){
            vScroll2.setValue(vScroll1.getValue());
        }
        if(e.getAdjustable() == hScroll2){
            hScroll1.setValue(hScroll2.getValue());
        }
        if(e.getAdjustable() == vScroll2){
            vScroll1.setValue(vScroll2.getValue());
        }

        t1.x = (int) (getSize().width * (float) hScroll1.getValue() / 100);
        t1.y = (int) (getSize().height * (float) vScroll1.getValue() / 100);
        t1.repaint();
    }
}

class textPanel extends Panel 
{
    TextField Text1;

    public int x = 0, y = 0;

    public void paint (Graphics g)
    {
        g.drawString("Hello from Java!", x, y);
    }
}    
