import java.awt.*;
import java.applet.*;
import java.awt.image.*;
/*
<APPLET
CODE=copier.class
WIDTH=600
HEIGHT=150 >
</APPLET>
*/
public class copier extends Applet {
Image image, image2;
public void init()
{
image = getImage(getDocumentBase(), "image.jpg");
int pixels[] = new int[485 * 88];
PixelGrabber pg = new PixelGrabber(image, 0, 0, 485, 88,
pixels, 0, 485);
try {
pg.grabPixels();
}
catch (InterruptedException e) {}
image2 = createImage(new MemoryImageSource(485, 88, pixels, 0 ,
485));
}
public void paint(Graphics g)
{
g.drawImage(image2, 10, 10, this);
}
}
