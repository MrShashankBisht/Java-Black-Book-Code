import java.awt.*;
import java.applet.*;
import java.awt.image.*;
/*
<APPLET
CODE=grayscale.class
WIDTH=300
HEIGHT=300 >
</APPLET>
*/
public class grayscale extends Applet {
Image image, image2;
public void init()
{
image = getImage(getDocumentBase(), "whirl1.gif");
int pixels[] = new int[248 * 248];
PixelGrabber pg = new PixelGrabber(image, 0, 0, 248, 248,
pixels, 0, 248);
try {
pg.grabPixels();
}
catch (InterruptedException e) {}
for (int loop_index = 0; loop_index < 248 * 248; loop_index++){
int p = pixels[loop_index];
int red = (0xff & (p >> 16));
int green = (0xff & (p >> 8));
int blue = (0xff & p);
int avg = (int) ((red + green + blue) / 3);
pixels[loop_index] = (0xff000000 | avg << 16 | avg << 8 | avg);
}
image2 = createImage(new MemoryImageSource(248, 248, pixels, 0 ,
248));
}
public void paint(Graphics g)
{
g.drawImage(image2, 10, 10, this);
}
}
