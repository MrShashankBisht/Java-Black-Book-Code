import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<APPLET
CODE = progressbarupdate.class
WIDTH = 400
HEIGHT = 200 >
</APPLET>
*/
public class progressbarupdate extends JApplet
{
JProgressBar jprogressbar = new JProgressBar();
JButton jbutton = new JButton("Increment the progress bar");
public void init()
{
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
contentPane.add(jprogressbar);
contentPane.add(jbutton);
jprogressbar.setStringPainted(true);
jbutton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{
jprogressbar.setValue(jprogressbar.getValue() + 10);
}
});
}
}
