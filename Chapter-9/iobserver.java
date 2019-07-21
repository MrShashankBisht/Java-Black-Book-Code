import java.awt.*;
import java.applet.*;
/*
<APPLET
CODE=iobserver.class
WIDTH=600
HEIGHT=150 >
</APPLET>
*/
public class iobserver extends Applet
{
Image image;
public void init()
{
image = getImage(getDocumentBase(), "image.jpg");
}
public void paint(Graphics g)
{
g.drawImage(image, 10, 10, this);
}
public boolean imageUpdate(Image img, int flags, int x, int y,
int w, int h)
{
if ((flags & ALLBITS) != 0) {
repaint(x, y, w, h);
}
return (flags & ALLBITS) == 0;
}
}
