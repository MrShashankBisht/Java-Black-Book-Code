import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.image.VolatileImage;
import java.awt.event.*;

public class applet13 extends Component {
	public VolatileImage buffer = null;

    void createBackBuffer() {
	if (buffer != null) {
		buffer.flush();
		buffer = null;
	}
		buffer = createVolatileImage(getWidth(), getHeight());
}
    public void paint(Graphics g) {
	if (buffer == null) {
		createBackBuffer();
	}
	do {
		int code = buffer.validate(getGraphicsConfiguration());
		if (code == VolatileImage.IMAGE_RESTORED) {}
else if (code == VolatileImage.IMAGE_INCOMPATIBLE) {
			createBackBuffer();
		}
		Graphics graph = buffer.getGraphics();
		graph.setColor(Color.white);
		graph.fillRect(0, 0, getWidth(), getHeight());
		graph.setColor(Color.red);
		graph.drawLine(0, 0, getWidth(), getHeight());
		g.drawImage(buffer, 0, 0, this);
	} while (buffer.contentsLost());
    }

    public static void main(String args[]) {
	Frame frm = new Frame();
	frm.setSize(500, 500);
	frm.add(new applet13());
	frm.setVisible(true);
	frm.addWindowListener(new WindowAdapter() {public void
windowClosing(WindowEvent e) {System.exit(0);}});

    }
}
