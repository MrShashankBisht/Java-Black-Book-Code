import javax.swing.*;
import java.awt.*;

/*
<APPLET
CODE=imageapp.class
WIDTH=500
HEIGHT=270 >
</APPLET>
*/
public class imageapp extends JApplet implements Runnable {
  DrawPanel drawPanel;
  Image image;
  int imagenum = 0;
  String message ="Loading...";
  boolean doneloading = false;
  public void init () {
	  Container conpane = getContentPane ();
	  drawPanel = new DrawPanel (this);
	  conpane.add (drawPanel);
	  image = getImage (getCodeBase (), "lilies.jpg" );
  } 
  public void start () {
    Thread thrd = new Thread (this);
    thrd.start ();
  }
  public void run ()  {
    int width = image.getWidth (this);
	if (width >= 0) {
		 doneloading = true;
		 repaint ();
		 return;
    } 
    while (!doneloading) {
    	try {
        	Thread.sleep (500);
      	} catch (InterruptedException ie) {}
         	repaint ();
    }
  }
  public boolean imageUpdate (Image img, int info,
                             int x, int y, int w, int h) {
    if (info != ALLBITS) {
           return true;
    } else {
        doneloading = true;
        return false;
    }
  }

}
class DrawPanel extends JPanel {
  imageapp imgparent = null;
  DrawPanel (imageapp parent) {
    imgparent = parent;
  }
  public void paintComponent (Graphics g) {
    super.paintComponent (g);
 
    if (imgparent.doneloading)
        g.drawImage (imgparent.image,10,10,this);
    else
        g.drawString (imgparent.message, 10,10);
  }
 }
