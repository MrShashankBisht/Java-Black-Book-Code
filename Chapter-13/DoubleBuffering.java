import java.applet.*; 
import java.awt.event.*; 
import java.awt.*; 
/* <APPLET
CODE = DoubleBuffering.class
WIDTH = 300
HEIGHT = 300>
</APPLET>
*/
public class DoubleBuffering extends Applet implements MouseMotionListener { 
	Graphics bufferGraphics; 
	Image offscreen; 
	Dimension dim; 
	int curX, curY; 
	public void init() { 
		dim = getSize(); 
        addMouseMotionListener(this); 
        setBackground(Color.white); 
        offscreen = createImage(dim.width,dim.height); 
        bufferGraphics = offscreen.getGraphics(); 
	} 
	public void paint(Graphics g) { 
		bufferGraphics.clearRect(0,0,dim.width,dim.width); 
        bufferGraphics.setColor(Color.gray); 
        bufferGraphics.drawString("Double-buffered for you",2,10); 
        bufferGraphics.fillRect(curX,curY,20,20); 
        g.drawImage(offscreen,0,0,this); 
	} 
	public void update(Graphics g) { 
		paint(g); 
	} 
	public void mouseMoved(MouseEvent evt) { 
		curX = evt.getX(); 
		curY = evt.getY(); 
		repaint(); 
	} 
	public void mouseDragged(MouseEvent evt) {} 
}