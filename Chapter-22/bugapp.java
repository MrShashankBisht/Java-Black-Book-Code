import java.awt.Graphics;
import java.awt.Image;
/*
<APPLET
CODE=bugapp.class
WIDTH=500
HEIGHT=270 >
</APPLET>
*/

public class bugapp extends java.applet.Applet {
Image image;
public void init() {
image = getImage(getCodeBase(),
"lilies.jpg");
}
public void paint(Graphics g) {
g.drawImage(image, 10, 10,this);
}
}
