import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.*;
public class szWin {
	static JFrame swind = new JFrame("The Frame Window being Sized");
	public static void main(String[] args) {
		Toolkit tk = swind.getToolkit();
		Dimension wz =  tk.getScreenSize();
		int x = wz.width/3;
		int y = (wz.height)/3 - swind.getHeight();
		swind.setLocation(x,y);
		swind.setBounds(x, y, wz.width/3, wz.height/3);
		swind.setVisible(true);
		swind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}