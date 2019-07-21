import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
/*
<APPLET
CODE = MoveBall.class
WIDTH = 300
HEIGHT = 300>
</APPLET>
*/
public class MoveBall extends JApplet{
	private final int WIDTH = 350;
	private final int HEIGHT = 300;
	private PaintSurface canvas;
	public void init() {
		this.setSize(WIDTH, HEIGHT);
		canvas = new PaintSurface();
		this.add(canvas, BorderLayout.CENTER);
		Thread t = new AnimationThread(this);
		t.start();
	}
}
class AnimationThread extends Thread {
	JApplet c;
	public AnimationThread(JApplet c) {
		this.c = c;
	}
	public void run() {
		while (true) {
			c.repaint();
			try {Thread.sleep(20);}
			catch (InterruptedException ex) {}
		}
	}
}
class PaintSurface extends JComponent {
	int x_pos = 0;     
	int y_pos = 150;   
	int d = 20;        
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
		RenderingHints.VALUE_ANTIALIAS_ON);
		x_pos += 2;    
		Shape ball = new Ellipse2D.Float(
		x_pos, y_pos, d, d);
		g2.setColor(Color.RED);
		g2.fill(ball);
	}
}