import java.applet.Applet;
import java.awt.*;

/*
<APPLET
CODE=scrollpane1.class
WIDTH=200
HEIGHT=200 >
</APPLET>
*/

class TextPanel extends Panel
{
public Dimension getPreferredSize()
{
return new Dimension(600, 600);
}
public void paint (Graphics g)
{
g.drawString ("Welcome to our big book of Java programming. In this book, we'll cover as much Java programming -- in depth", 0, 60);
}
}


public class scrollpane1 extends Applet
{
ScrollPane scrollpane1 = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
TextPanel t1;
TextPanel t2;
public void init(){
if(scrollpane1.isWheelScrollingEnabled())
{
scrollpane1 = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
t1 = new TextPanel();
scrollpane1.add(t1);
add(scrollpane1);
}
else
{
scrollpane1 = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
t2 = new TextPanel();
scrollpane1.add(t2);
add(scrollpane1);
}
}
}
