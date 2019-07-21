import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<APPLET
CODE = internalframe.class
WIDTH = 450
HEIGHT = 300>
</APPLET>
*/
public class internalframe extends JApplet implements ActionListener
{
JDesktopPane jdesktoppane = new JDesktopPane();
static int framenumber = 1;
public void init()
{
JPanel jpanel = new JPanel();
Container contentPane = getContentPane();
JButton jbutton = new JButton("New internal frame");
jpanel.add(jbutton);
contentPane.add(jpanel, BorderLayout.SOUTH);
contentPane.add(jdesktoppane, BorderLayout.CENTER);
jbutton.addActionListener(this);
}
public void actionPerformed(ActionEvent event)
{
JInternalFrame jinternalframe = new JInternalFrame();
Container contentPane = jinternalframe.getContentPane();
jinternalframe.setLocation(20, 20);
jinternalframe.setTitle("Internal Frame " + framenumber);
framenumber++;
jinternalframe.setClosable(true);
jinternalframe.setResizable(true);
jinternalframe.setMaximizable(true);
jinternalframe.setIconifiable(true);
jinternalframe.setVisible(true);
contentPane.setLayout(new FlowLayout());
contentPane.add(new JTextArea(5, 20), "Center");
jinternalframe.pack();
jdesktoppane.add(jinternalframe, 5);
}
}
