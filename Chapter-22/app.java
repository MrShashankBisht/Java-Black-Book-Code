import javax.swing.*;
import java.awt.*; 
/*
<APPLET
CODE=app.class
WIDTH=500
HEIGHT=200 >
</APPLET>
*/

public class app extends JApplet
{
  public void init () {
    Container conpane = getContentPane(); 
        Image image = getImage (getCodeBase(), "lilies.jpg"); 
    
    DrawPanel drawPanel =  new DrawPanel (image); 
     
    conpane.add (drawPanel); 
  } 

} 
class DrawPanel extends JPanel
{
  Image imag = null; 
 
  DrawPanel (Image image) 
  { imag = image; } 

  public void paintComponent (Graphics g) { 
   
   super.paintComponent (g); 

    int imgX = getSize().width/2 - imag.getWidth(this); 
   int imgY = getSize().height/2 - imag.getHeight(this);

    g.drawImage(imag, imgX, imgY, this); 
  } 

}
