import java.awt.*;
import java.awt.event.*;

class appframe extends Frame implements WindowListener,                           
             WindowFocusListener, WindowStateListener {
    final static String line = "\n";
    TextArea text1;
	public appframe(String title)
	{
		super(title);
	    text1 = new TextArea(5,20);
        text1.setEditable(false);
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setSize(new Dimension(300,250));
        scrollPane.add(text1);
        add(scrollPane);
        addWindowListener(this);;
	    addWindowFocusListener(this);
        addWindowStateListener(this);
        setSize(400,400);
        setVisible(true);
        }
    public void windowClosing(WindowEvent e) {
        text1.append("WindowListener(Closing) method called."  + line);
            }

    public void windowClosed(WindowEvent e) {
        text1.append("WindowListener(Closed) method called" + line);
    }
    public void windowOpened(WindowEvent e) {
       text1.append("WindowListener(Opened method called" + line);
    }
    public void windowIconified(WindowEvent e) {
        text1.append("WindowListener(Iconfied) method called." + line);
    }
    public void windowDeiconified(WindowEvent e) {
        text1.append("WindowListener(Deiconified) method called." + line);
    }
    public void windowActivated(WindowEvent e) {
        text1.append("WindowListener(Activated) method called" + line);
    }
    public void windowDeactivated(WindowEvent e) {
        text1.append("WindowListener(Deactivated) method called" + line);
    }
    public void windowGainedFocus(WindowEvent e) {
        text1.append("WindowFocusListener(GainedFocus) method called" + line);
    }
    public void windowLostFocus(WindowEvent e) {
        text1.append("WindowFocusListener(LostFocus) method called" + line);
    }
    public void windowStateChanged(WindowEvent e) {
        text1.append(
          "WindowStateListener(StateChanged) method called"+ line);
    }
}
public class app
{
public static void main(String[] args) {
                appframe apfrm=new appframe("Windows Event Handling");
                }
}