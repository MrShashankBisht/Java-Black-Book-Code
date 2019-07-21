import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*; 
import java.io.*; 
import java.net.*; 
import java.net.URL;
import javax.swing.border.*; 
import javax.swing.event.*; 
/* <APPLET
CODE = Internalframeeg.class
WIDTH = 400
HEIGHT = 400>
</APPLET>
*/
public class Internalframeeg extends JApplet implements ActionListener{
JDesktopPane jdesktoppane = new JDesktopPane();
static int framenumber = 1;
String msg="";
TextArea txt1;
public void init() {
JPanel jpanel = new JPanel();
Container contentPane = getContentPane();
JButton jbutton = new JButton("New internal frame");
txt1= new TextArea("output displayed here",3,30);
jpanel.add(jbutton);
jpanel.add(txt1);
contentPane.add(jpanel, BorderLayout.SOUTH);
contentPane.add(jdesktoppane, BorderLayout.CENTER);
jbutton.addActionListener(this);
}
InternalFrameAdapter activator1 = new InternalFrameAdapter() { 
public void internalFrameActivated(InternalFrameEvent e) { 
JInternalFrame fr = (JInternalFrame)e.getSource(); 
InternalFrameListener[] jarr=fr.getInternalFrameListeners();
txt1.setText(" "+ jarr[1] + "      " + jarr[2]+ "  ");
} 
public void internalFrameIconified(InternalFrameEvent e) { 
JInternalFrame fr = (JInternalFrame)e.getSource(); 
txt1.setText("  " +fr.getMostRecentFocusOwner());
} 
public void internalFrameClosed(InternalFrameEvent e) { 
JInternalFrame fr = (JInternalFrame)e.getSource(); 
txt1.setText("  " +fr.getFocusCycleRootAncestor());
} 
};
InternalFrameAdapter activator2 = new InternalFrameAdapter() { 
public void internalFrameOpened(InternalFrameEvent e) { 
JInternalFrame fr = (JInternalFrame)e.getSource(); 
txt1.setText("2nd listener event  ");
} 
}; 
public void actionPerformed(ActionEvent event) {
String str= event.getActionCommand();
if(str.equals("New internal frame")){
JInternalFrame jinternalframe = new JInternalFrame();
Container contentPane = jinternalframe.getContentPane();
jinternalframe.setLocation(20, 20);
jinternalframe.setTitle("Frame " + framenumber);
if(framenumber==1){
jinternalframe.addInternalFrameListener(activator1);
jinternalframe.addInternalFrameListener(activator2);
}else if(framenumber==2){
}
framenumber++;
jinternalframe.setClosable(true);
jinternalframe.setResizable(true);
jinternalframe.setMaximizable(true);
jinternalframe.setIconifiable(true);
jinternalframe.setVisible(true);
contentPane.setLayout(new FlowLayout());
contentPane.add(new JTextArea(5, 15), "Center");
jinternalframe.pack();
jdesktoppane.add(jinternalframe, 2);
}
}
}
