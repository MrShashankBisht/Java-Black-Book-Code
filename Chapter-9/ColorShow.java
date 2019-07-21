import java.awt.*;
import java.applet.*;
/*
<applet code ="Colorshow" width=300 height=200>
</applet>
*/
public class ColorShow extends Applet {
	public void paint(Graphics g){
		g.setColor(Color.red);
		g.drawOval(10, 10, 50, 50);
		g.fillOval(70, 90, 140, 100);
		
		g.setColor(Color.blue);
		g.drawOval(190, 10, 90, 30);
		g.drawRect(10, 10, 60, 50);
		
		g.setColor(Color.cyan);
		g.fillRect(100,10,60,50);
		g.drawRoundRect(190, 10, 60, 50, 15, 15);
		
		g.setColor(Color.green);
		g.drawArc(10, 20, 150, 190, 160,60);
		g.fillArc(230, 15, 150, 200, 150, 75);				
	}
}
