import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;

/*
<APPLET
    CODE=scroll.class
    WIDTH=400
    HEIGHT=100 >
</APPLET>
*/


public class scroll extends Applet implements AdjustmentListener 
{

    TextField text1;
    Scrollbar scroll1, scroll2;

    public void init()
    {
        scroll1 = new Scrollbar(Scrollbar.HORIZONTAL, 1, 20, 1, 200);
        add(scroll1);
        scroll1.addAdjustmentListener(this);
        text1 = new TextField(20);
        add(text1);
        scroll2 = new Scrollbar(Scrollbar.VERTICAL, 1, 20, 1, 200);
        add(scroll2);
        scroll2.addAdjustmentListener(this);
    }


    public void adjustmentValueChanged(AdjustmentEvent e)
    {
        if(e.getAdjustable() == scroll1 || 
            e.getAdjustable() == scroll2) {
            text1.setText("Horizontal: " + scroll1.getValue() +
                " Vertical: " + scroll2.getValue());
        }
    }
}


