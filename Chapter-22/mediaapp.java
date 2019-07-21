import javax.swing.*;
import java.awt.*;

/*
<APPLET
CODE=mediaapp.class
WIDTH=500
HEIGHT=270 >
</APPLET>
*/

public class mediaapp extends JApplet implements Runnable {
  DrawPanel drawPanel;
  MediaTracker Tracker;
  Image image;
  int imagenum = 0;
  boolean show = false;
  String message ="Loading...";
  public void init () {
    Container conpane = getContentPane ();
    drawPanel = new DrawPanel (this);
    conpane.add (drawPanel);
    image = getImage (getCodeBase (), "lilies.jpg" );
    Tracker = new MediaTracker (this);
    Tracker.addImage (image, imagenum);
  } 
  public void start () {
    if (!Tracker.checkID (imagenum) ) {
        Thread thrd = new Thread (this);
        thrd.start ();
    } else
        show = true;
  } 
  public void run ()  {
    repaint ();
     try {
      Tracker.waitForID (imagenum );
    } catch (InterruptedException e) {}
  
    if (Tracker.isErrorID (imagenum ))
        message= "Error";
    else
        show = true;
       repaint ();
  }
} 


class DrawPanel extends JPanel {
  mediaapp parent = null;
  DrawPanel (mediaapp parent) {
    this.parent = parent;
  } 
  public void paintComponent (Graphics g) {
    super.paintComponent (g);

 
    if (parent.show)
        g.drawImage (parent.image,10,10,this);
    else
        g.drawString (parent.message, 10,10);
  } 
}  
