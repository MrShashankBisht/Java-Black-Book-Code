import java.awt.*;
import java.applet.*;
/*
<APPLET
CODE=mediatracker.class
WIDTH=600
HEIGHT=150 >
</APPLET>
*/
public class mediatracker extends Applet
{
Image image;
public void init()
{
MediaTracker tracker = new MediaTracker(this);
image = getImage(getDocumentBase(), "image.jpg");
tracker.addImage(image, 0);
try {
tracker.waitForAll();
}
catch (InterruptedException ex) { }
}
public void paint(Graphics g)
{
g.drawImage(image, 10, 10, this);
}
}
