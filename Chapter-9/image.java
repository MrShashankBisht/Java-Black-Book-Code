import java.awt.*;
import java.applet.*;
/*
<APPLET
CODE=image.class
WIDTH=500
HEIGHT=150 >
</APPLET>
*/
public class image extends Applet
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
}
