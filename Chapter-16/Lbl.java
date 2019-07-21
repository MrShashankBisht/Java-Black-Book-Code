import java.awt.*; 
import javax.swing.*; 
/* <applet code="Lbl" width=600 height=250> 
  </applet> */ 
 
public class Lbl extends JApplet { 
	public void init() { 
	    ImageIcon lb = new ImageIcon("illusion.gif"); 
	    JLabel BL = new JLabel("Zollner's illusion", lb, JLabel.CENTER); 
	    add(BL); 
	} 
}

