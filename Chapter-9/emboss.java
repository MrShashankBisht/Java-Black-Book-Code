import java.awt.*;
import java.awt.image.*;
import java.applet.*;
/*<APPLET
CODE=emboss.class
WIDTH=300
HEIGHT=300 >
</APPLET>
*/
public class emboss extends Applet
{
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
for (int x = 2; x < 247; x++){
for (int y = 2; y < 247; y++){
int red = ((pixels[(x + 1) * 248 + y + 1] & 0xFF) -
(pixels[x * 248 + y] & 0xFF)) + 128;
int green = (((pixels[(x + 1) * 248 + y + 1] & 0xFF00) /
0x100) % 0x100 - ((pixels[x * 248 + y] & 0xFF00) /
0x100) % 0x100) + 128;
int blue = (((pixels[(x + 1) * 248 + y + 1] &
0xFF0000) / 0x10000) % 0x100 - ((pixels[x * 248 + y] &
0xFF0000) / 0x10000) % 0x100) + 128;
int avg = (red + green + blue) / 3;
pixels[x * 248 + y] = (0xff000000 | avg << 16 | avg << 8 | avg);
}
}
image2 = createImage(new MemoryImageSource(248, 248, pixels, 0 ,
248));
}
public void paint(Graphics g)
{
g.drawImage(image2, 0, 0, this);
}
}
